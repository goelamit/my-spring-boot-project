Getting Started
1- Import the maven project to the IDE. 2- Start the spring boot application. 3- Execute the below URL with POST to create the in memory data in H2....

http://localhost:8080/customers

with Request Body----

{ "firstName": "Test", "lastName": "Data", "userId": "test12345", "email": "a@a.com", "address": "101010", "city": "Test", "state": "TX", "zip": "12345" }

4- Login to h2 console with below URL & select JDBC URL as jdbc:h2:mem:testdb

http://localhost:8080/h2-console/login.jsp

5- After connection to the DB, check the Customer table. 6- Execute the below URL with GET to check the all customers created.

http://localhost:8080/customers/all
