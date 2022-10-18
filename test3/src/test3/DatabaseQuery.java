package test3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
//set @db = 'mydb';
//set @tble = 'table';

//set @query = concat('INSERT INTO tablefoo SELECT * FROM ', @db, '.', @tble);
//PREPARE stmt FROM @query;
//EXECUTE stmt;
//DEALLOCATE PREPARE stmt;
public class  DatabaseQuery {
    String[] retstring = new String[10]; 
	public  String[] logindbDatabase(Connection conn,String var1,String var2,String[] col1,String[] col2,String chkopt) {
    	 //
    	if(chkopt=="getdata") {
    		try{
    			PreparedStatement statement = conn.prepareStatement("SELECT * from users");
    			ResultSet result = statement.executeQuery();
    			if(result.next()) {
 					ArrayList<String> usernames = new ArrayList<>();
 					ArrayList<String> passwords = new ArrayList<>();
 					usernames.add(result.getString("username"));
 					passwords.add(result.getNString("password"));
 					while(result.next()) {
 						//System.out.println(result.getString("state"));
 						usernames.add(result.getString("username"));
 						passwords.add(result.getNString("password"));
 		            }
 					//System.out.println("size "+statearray.size());
 					for(int cnt=0;cnt<10;cnt++)
 						col1[cnt]="&&";
 	                for(int cnt=0;cnt < usernames.size();cnt++) {
 	                	col1[cnt]=usernames.get(cnt)+"-"+passwords.get(cnt);
 	                	//col2[cnt]=passwords.get(cnt);
 	                	//System.out.println(col1[cnt]+"&&"+col2[cnt]);
 	                }
 					conn.close();
 					return col1;//"Success";
 				}else {
 					conn.close();
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
