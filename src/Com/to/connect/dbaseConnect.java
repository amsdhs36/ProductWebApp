package Com.to.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbaseConnect {
	public static Connection createConnection()
	 {
	     Connection con = null;
	     String url = "jdbc:mysql://localhost:3306/ProductApp"; //MySQL URL followed by the database name
	     String username = "root"; //MySQL username
	     String password = "12345"; //MySQL password
	     System.out.println("In dbaseConnect.java class ");
	      
	     try
	     {
	         try
	         {
	            Class.forName("com.mysql.cj.jdbc.Driver"); //loading MySQL drivers. 
	         } 
	         catch (ClassNotFoundException e)
	         {
	            e.printStackTrace();
	         }       
	         con = DriverManager.getConnection(url, username, password); //attempting to connect to MySQL database
	         System.out.println("Printing connection object "+con);
	     } 
	     catch (Exception e) 
	     {
	        e.printStackTrace();
	     }   
	     return con; 
	 }
}
