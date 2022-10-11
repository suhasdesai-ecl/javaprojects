package testdel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String delstr = "4444";
		String useurl = "jdbc:mysql://localhost:3306/tempstudentdb";
		Connection con = getConnection(useurl);
		//PreparedStatement statement = con.prepareStatement("SELECT studentID from studentinfo where studentID = '111111'");
        String sqldel = "delete from studentinfo where studentID = ?";
		PreparedStatement statement = con.prepareStatement(sqldel);
		//statement.setString(1,"39393");
		statement.setString(1, delstr);
		//ResultSet result = statement.executeQuery();
		int result  = statement.executeUpdate();
		System.out.println(result + " deleted ");
		con.close();

	}
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
