DECLARE
CURSOR C2 IS SELECT CustomerID, Balance FROM Customers;
BEGIN
FOR cur IN C2
LOOP
IF cur.Balance > 10000 THEN
	UPDATE Customers SET IsVIP='True' WHERE CustomerID=cur.CustomerID;
END IF;
END LOOP;
COMMIT;
END;
/
