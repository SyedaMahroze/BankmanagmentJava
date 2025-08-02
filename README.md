# BankmanagmentJava
This is a Java Swing-based desktop application implementing a simple Bank Management System. It follows the MVC (Model-View-Controller) pattern and allows interaction with various modules such as Customers, ATM Cards, Accounts, Transactions, Loans, Employees, etc.
# Project Structure
bankManagement/
│
├── model/         # Java classes for data models (e.g., Account.java)
├── dao/           # Database access logic (e.g., AccountDAO.java)
├── controller/    # Controllers for handling business logic (e.g., AccountController.java)
├── view/          # Swing UI windows (e.g., AccountView.java)
└── MainApp.java   # Main menu GUI to access different modules

# How to Run
Install Requirements

Java JDK (version 8 or later)

Any IDE (e.g., IntelliJ, Eclipse, NetBeans)

# MySQL Database (or any JDBC-compatible RDBMS)

Setup Database

Create a database named (e.g., bankdb)

Create Account table using:

CREATE TABLE Account (
  AccountID INT AUTO_INCREMENT PRIMARY KEY,
  CustomerID INT NOT NULL,
  AccountType VARCHAR(100)
);
Configure DBConnection

Add your own database credentials in the DBConnection.java file.

Compile and Run

Run MainApp.java

# Technologies Used
Java Swing (GUI)
JDBC (Database Connectivity)
MySQL (Relational Database)
MVC Design Pattern
