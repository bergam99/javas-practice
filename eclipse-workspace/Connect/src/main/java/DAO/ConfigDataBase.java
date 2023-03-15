package DAO;

public class ConfigDataBase {
	
	public static String driver;
	public static String login;
	public static String pass;
	public static String url;

	
	public static void init() throws ClassNotFoundException {
		 driver = "com.mysql.cj.jdbc.Driver";
		 login = "Mimi";
		 pass = "Wlwl123123!";
		 url = "jdbc:musql://localhost:3306/myDB";
		 
		 Class.forName(driver);
	}
}