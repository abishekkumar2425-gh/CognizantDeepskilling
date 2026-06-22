SELECT * FROM Customers;
SELECT * FROM Loans;
SET SQL_SAFE_UPDATES = 0;
CALL BankOperations();
DELIMITER $$

CREATE PROCEDURE BankOperations()
BEGIN

    -- Scenario 1
    UPDATE Loans l
    JOIN Customers c
    ON l.CustomerID = c.CustomerID
    SET l.InterestRate = l.InterestRate - 1
    WHERE TIMESTAMPDIFF(YEAR,c.DOB,CURDATE()) > 60;
    SELECT LoanID, CustomerID, InterestRate FROM Loans;

    -- Scenario 2
    UPDATE Customers
    SET IsVIP = TRUE
    WHERE Balance > 10000;
    SELECT CustomerID, Name, Balance, IsVIP FROM Customers;

    -- Scenario 3
    SELECT
        c.CustomerID,
        c.Name,
        l.EndDate,
        CONCAT(
            'Reminder: Dear ',
            c.Name,
            ', your loan is due on ',
            l.EndDate
        ) AS Message
    FROM Customers c
    JOIN Loans l
    ON c.CustomerID = l.CustomerID
    WHERE l.EndDate BETWEEN CURDATE()
    AND DATE_ADD(CURDATE(),INTERVAL 30 DAY);

END$$

DELIMITER ;