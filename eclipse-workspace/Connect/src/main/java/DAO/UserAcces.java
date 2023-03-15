package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import Entity.User;

public class UserAcces{
	public static User ifUserExist(String login, String pass) throws SQLException {
	
		User user = null;
		
		String req = "select * from User where Login='" + login + "' and Password = '" + 
				pass + "'";
		
		Connection conn = DriverManager.getConnection(ConfigDataBase.url, ConfigDataBase.login,
				ConfigDataBase.pass);
		
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(req);
		if(rs.next()) {
			
			
			user = new User(rs.getString("Login"), rs.getString("Password"));
		}
		conn.close();
		stmt.close();
		rs.close();
		
		return user;
	}
	

}