DECLARE
CURSOR C1 IS SELECT c.CustomerID, TRUNC(MONTHS_BETWEEN(SYSDATE,c.DOB)/12) as Age,l.InterestRate from Customers c join Loans l on c.CustomerID=l.CustomerID;
BEGIN
FOR i IN C1 LOOP
IF i.Age > 60 THEN
	UPDATE Loans SET InterestRate=InterestRate-1 WHERE CustomerID=i.CustomerID ;
END IF;
END LOOP;
END;
/
