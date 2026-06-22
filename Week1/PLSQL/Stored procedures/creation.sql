USE bankdb;
CREATE TABLE Accounts (
    AccountID INT PRIMARY KEY,
    CustomerID INT,
    AccountType VARCHAR(20),
    Balance DECIMAL(10,2),
    LastModified DATE
);
INSERT INTO Accounts
(AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES
(1, 1, 'Savings', 1000, CURDATE()),
(2, 2, 'Checking', 1500, CURDATE()),
(3, 3, 'Savings', 2000, CURDATE()),
(4, 4, 'Checking', 2500, CURDATE()),
(5, 5, 'Savings', 3000, CURDATE()),
(6, 6, 'Checking', 3500, CURDATE());
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Name VARCHAR(100),
    Position VARCHAR(50),
    Salary DECIMAL(10,2),
    Department VARCHAR(50),
    HireDate DATE
);
INSERT INTO Employees
VALUES
(1,'Alice Johnson','Manager',70000,'HR','2015-06-15'),
(2,'Bob Brown','Developer',60000,'IT','2017-03-20'),
(3,'David Smith','Analyst',50000,'HR','2018-04-10'),
(4,'Emma Wilson','Tester',45000,'IT','2019-08-12'),
(5,'Chris Martin','Executive',55000,'HR','2020-01-25');