package kr.or.ddit.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectionTest {
	
	public static void main(String[] args) {
		
		
		String user = "idTest";
		String password = "pwTest";
		String url = "jdbc:mysql://localhost:3306";
		try(
			Connection conn = DriverManager.getConnection(url, user, password);
		) {
			System.out.println(conn.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
