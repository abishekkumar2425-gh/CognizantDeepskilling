-- scenario1
SELECT * FROM Accounts;
SELECT * FROM Employees;
SET SQL_SAFE_UPDATES = 0;
CALL ProcessMonthlyInterest();
DELIMITER $$
CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType = 'Savings';
    SELECT * FROM Accounts;
END$$

DELIMITER ;
-- scenario2
DROP PROCEDURE IF EXISTS UpdateEmployeeBonus;
CALL UpdateEmployeeBonus('HR',10);
DELIMITER $$
CREATE PROCEDURE UpdateEmployeeBonus(
    IN p_dept VARCHAR(50),
    IN p_bonusPercent DECIMAL(5,2))
BEGIN
    UPDATE Employees SET Salary = Salary + (Salary * p_bonusPercent / 100) WHERE Department = p_dept;
    SELECT EmployeeID, Name, Department, Salary FROM Employees WHERE Department = p_dept;
END$$
DELIMETER;
-- scenario3
CALL TransferFunds(1,2,1000);
DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN sourceAcc INT,
    IN targetAcc INT,
    IN transferAmt DECIMAL(10,2)
)
BEGIN
    DECLARE sourceBalance DECIMAL(10,2);

    SELECT Balance
    INTO sourceBalance
    FROM Accounts
    WHERE AccountID = sourceAcc;

    IF sourceBalance >= transferAmt THEN
        UPDATE Accounts
        SET Balance = Balance - transferAmt
        WHERE AccountID = sourceAcc;

        UPDATE Accounts
        SET Balance = Balance + transferAmt
        WHERE AccountID = targetAcc;
        SELECT 'Transfer Successful' AS Message;
     ELSE
       SELECT 'Insufficient Balance' AS Message;
     END IF;
END$$

DELIMITER ;
