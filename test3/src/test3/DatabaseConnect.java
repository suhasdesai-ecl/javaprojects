package test3;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnect {
	static Connection conn;
	public Connection getConnection(String url) throws Exception {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			//String url = "jdbc:mysql://localhost:3306/studentdb";
			String username = "root";
			String password = "Scd45690!";
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url,username,password);
			}catch (Exception ee) {System.out.println("no database");return null;}
			//System.out.println("Connected "+url);
			return conn;
		}catch(Exception e) {System.out.println(e);}
		
		return null;
	}

}
