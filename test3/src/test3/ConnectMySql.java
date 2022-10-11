package test3;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectMySql {
   
	public static Connection getConnection(String url) throws Exception {
		try {
			String driver = "com.mysql.cj.jdbc.Driver";
			//String url = "jdbc:mysql://localhost:3306/studentdb";
			String username = "root";
			String password = "Scd45690!";
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,username,password);
			//System.out.println("Connected "+url);
			return conn;
		}catch(Exception e) {System.out.println(e);}
		
		return null;
	}

}
