package com.ejb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class SQLConnection {
private static Connection conn = null;
private Statement st = null;
/** Creates a new instance of SQLConnection */
public SQLConnection() {
}
/**
*
* @return
*/
public Connection getSQLConnection () {
String driver = "com.mysql.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/";
String dbname = "cbse";
try {
Class.forName(driver);
conn = DriverManager.getConnection(url + dbname, "root", "");
//instead of return statement this method return connection
//st = con.createStatement();
System.out.println("Connection Okay");
}
catch (Exception e) {
System.out.println(e);
System.out.println("Connection Not Okay");
}
return conn;
}
}