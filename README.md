# JDBC
JDBC example for a database called Entreprise 
![image](https://user-images.githubusercontent.com/64024996/151569772-e3e0f3ae-02c0-4f8d-91a3-ee2131f0a9bb.png)
![image](https://user-images.githubusercontent.com/64024996/151573471-5cb6e3de-3f38-4d2d-80a7-d189eba296bd.png)
Using dataBase MYSQL and Entreprise as the name of the database.
So here you can see the same output of select * from Employees and you can see the driver i used to connect the java application to the database.
we open a connection using a method from DriverManager class that takes the url, username and passowrd of the database as mentioned in the code. we create a new statement to execute a SQL query and we apply the method executeQuery that takes the query (select * from Employees) as parameter. The selected query will be saved on ResultSet.


Thank you.
