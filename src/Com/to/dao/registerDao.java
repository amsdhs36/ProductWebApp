package Com.to.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Com.to.connect.dbaseConnect;
import Com.to.data.User;

public class registerDao {
	public String registerUser(User user)throws SQLException{
		
   Connection con = null;
   PreparedStatement ps=null;
 
   try { 
	con=dbaseConnect.createConnection();
	String query="insert into user"+ "(first_name,last_name,email,username,password) values" +
		    "(?, ?, ?, ?, ?);";
	ps=con.prepareStatement(query);
   
   ps.setString(1, user.getFirst_name());
   ps.setString(2, user.getLast_name());
   ps.setString(3, user.getEmail());
   ps.setString(4,user.getUsername());
   ps.setString(5, user.getPassword());
      
   int result=ps.executeUpdate();
   if(result!=0)
      return "SUCCESS";
   
	       }
      catch (SQLException e) {
	 e.printStackTrace();
 }
	return "Something went wrong";
	
	}
	
 
 }