package test3;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
//import java.util.Scanner;

public class ManageStateDatabase {

	//public static String insDatabase() {
	//	try{
	//		ConnectMySql.getConnection();
	//	}catch(Exception err) {System.out.println(err);}
	//	return null;
	//}
	//public static String chkDatabase() {
	//	try{
	//		ConnectMySql.getConnection();
	//	}catch(Exception err) {System.out.println(err);}
	//	return null;
	//}
	static String[] retstring = {"&&","&&","&&"};
	
	public static String[] addStatesDatabase(String chkdb,String var1,String var2,String[] col1,String[] col2) {
		if (chkdb == "check") {
			try{
				String url = "jdbc:mysql://localhost:3306/states";
				Connection con = ConnectMySql.getConnection(url);
				PreparedStatement statement = con.prepareStatement("SELECT state from statelist");
				ResultSet result = statement.executeQuery();
				if(result.next()) {
					con.close();
					retstring[0]="success";
					return retstring;//"success"
					}else {
						retstring[0]="no";
						return retstring;//"no"
					}
			}catch(Exception err) {System.out.println(err);}
			retstring[0]="null";
			return retstring;//"null"
		}else if(chkdb == ""){
			try{
				String url = "jdbc:mysql://localhost:3306/states";
				Connection con = ConnectMySql.getConnection(url);
				PreparedStatement statement = con.prepareStatement("INSERT INTO statelist(state,stateab) VALUES ('"+var1+"','"+var2+"')" );
				statement.executeUpdate();
				con.close();
				retstring[0]="success";
				return retstring;//"Success";			 
			}catch(Exception err) {System.out.println(err);}
            retstring[0]="null";
			return retstring;//"null";
		}else if(chkdb == "read") {
			try{
				String url = "jdbc:mysql://localhost:3306/states";
				Connection con = ConnectMySql.getConnection(url);
				PreparedStatement statement = con.prepareStatement("SELECT * from statelist");
				ResultSet result = statement.executeQuery();
				if(result.next()) {
					ArrayList<String> statearray = new ArrayList<>();
					ArrayList<String> stateabarray = new ArrayList<>();
					statearray.add(result.getString("state"));
					stateabarray.add(result.getNString("stateab"));
					while(result.next()) {
						//System.out.println(result.getString("state"));
						statearray.add(result.getString("state"));
						stateabarray.add(result.getNString("stateab"));
		            }
					//System.out.println("size "+statearray.size());
	                for(int cnt=0;cnt < statearray.size();cnt++) {
	                	col1[cnt]=statearray.get(cnt);
	                	col2[cnt]=stateabarray.get(cnt);
	                	//System.out.println(col1[cnt]+"&&"+col2[cnt]);
	                }
					con.close();
					return col1;//"Success";
				}else {
					con.close();
					retstring[0]="no";
					return retstring;//"no";
				}
			}catch(Exception err) {System.out.println(err);}
			retstring[0]="null";
			return retstring;//"null";
		}
		retstring[0]="null";
		return retstring;//"null";
	}
}
