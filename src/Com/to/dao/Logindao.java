package Com.to.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Com.to.connect.dbaseConnect;

public class Logindao {
	public static boolean validate(String username,String password) throws SQLException{  
		boolean status=false;  
		Connection con1=null;
		PreparedStatement ps1=null;
			try {
				con1=dbaseConnect.createConnection();
     			String query="select * from user where username=? and password=?";      
	            ps1=con1.prepareStatement(query);  
	        	ps1.setString(1,username);  
	        	ps1.setString(2,password);  
		        ResultSet rs=ps1.executeQuery();  
		        status=rs.next();  
		  		}catch(Exception e){
		  			System.out.println(e);
		  			} 
			 
			     return status;  
		}  
}
