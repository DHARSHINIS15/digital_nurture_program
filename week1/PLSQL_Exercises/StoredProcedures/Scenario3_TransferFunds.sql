CREATE OR REPLACE PROCEDURE TransferFunds (SourceAccount IN NUMBER,DestinationAccount IN NUMBER, Amount IN NUMBER)
IS
sourceBalance Accounts.Balance%TYPE;
BEGIN
SELECT Balance into sourceBalance FROM Accounts WHERE AccountID=SourceAccount;
	IF sourceBalance>=Amount THEN
		UPDATE Accounts SET Balance=Balance-Amount WHERE AccountID=SourceAccount;
		UPDATE Accounts SET Balance=Balance+Amount WHERE AccountID=DestinationAccount;
	COMMIT;
	ELSE 
		DBMS_OUTPUT.PUT_LINE('Insufficient Balance');
	END IF;
END;
/

