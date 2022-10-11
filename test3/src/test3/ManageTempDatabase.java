package test3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ManageTempDatabase {
static String[] retstring = {"&&","&&","&&"};
	
	public static String[] addTempDatabase(String chkdb,String[] var1,String[] col1,String[] col2) {
		if (chkdb == "check") {
			try{
				String url = "jdbc:mysql://localhost:3306/tempstudentdb";
				Connection con = ConnectMySql.getConnection(url);
				PreparedStatement statement = con.prepareStatement("SELECT studentID from studentinfo");
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
				System.out.println("IN database sub");
				String url = "jdbc:mysql://localhost:3306/tempstudentdb";
				Connection con = ConnectMySql.getConnection(url);
				String[] tvar2 = new String[10];
				tvar2[0]="firstname";tvar2[1]="lastname";tvar2[2]="address1";tvar2[3]="address2";tvar2[4]="city";tvar2[5]="state";tvar2[6]="zip";
				tvar2[7]="gradelevel";tvar2[8]="studentID";
				//int sg = Integer.parseInt(var1[7]);
				    String fvar = var1[0]; //firstname
				    String lvar = var1[1]; //lastname
				    String avar = var1[2]; //address1
				    String avar2 = var1[3];//address2
				    String cvar = var1[4]; //city
				    String stvar = var1[5]; //state
				    String zvar = var1[6]; //zip
				    String gvar = var1[7]; //grade
				    String svar = var1[8]; //studentid
				    String gfvar = var1[10];//gua firstname
				    String glvar = var1[11];//gua lastname
				    String grelvar = var1[12];// relationship
				    System.out.println("***** "+var1[5]);
                   //PreparedStatement statement = con.prepareStatement("INSERT INTO statelist(state,stateab) VALUES ('"+var1+"','"+var2+"')" );
                   //PreparedStatement statement = con.prepareStatement("INSERT INTO studentinfo(firstname,lastname,studentID) VALUES ('"+fvar+"','"+lvar+"','"+svar+"')");
 	                String sqlstmt = "DELETE * from studentinfo where studentID = " + svar;
 	                ((Statement) con).executeUpdate(sqlstmt);
				    PreparedStatement statement = con.prepareStatement("INSERT INTO studentinfo(firstname,lastname,address1,address2,city,state,zip,gradelevel,studentID,guafirstname,gualastname,relationship) VALUES ('"+fvar+"','"+lvar+"','"+avar+"','"+avar2+"','"+cvar+"','"+stvar+"','"+zvar+"','"+gvar+"','"+svar+"','"+gfvar+"','"+glvar+"','"+grelvar+"')" );
				    statement.executeUpdate();
				//con.close();
				retstring[0]="success";
				return retstring;//"Success";			 
			}catch(Exception err) {System.out.println(err);}
            retstring[0]="null";
			return retstring;//"null";
		}else if(chkdb == "read") {
			try{
				String url = "jdbc:mysql://localhost:3306/tempstudentdb";
				Connection con = ConnectMySql.getConnection(url);
				//PreparedStatement statement = con.prepareStatement("SELECT * from statelist");
				//ResultSet result = statement.executeQuery();
				//if(result.next()) {
				//	ArrayList<String> statearray = new ArrayList<>();
				//	ArrayList<String> stateabarray = new ArrayList<>();
				//	statearray.add(result.getString("state"));
				//	stateabarray.add(result.getNString("stateab"));
				//	while(result.next()) {
						//System.out.println(result.getString("state"));
				//		statearray.add(result.getString("state"));
				//		stateabarray.add(result.getNString("stateab"));
		        //    }
					//System.out.println("size "+statearray.size());
	                //for(int cnt=0;cnt < statearray.size();cnt++) {
	                //	col1[cnt]=statearray.get(cnt);
	                //	col2[cnt]=stateabarray.get(cnt);
	                //	//System.out.println(col1[cnt]+"&&"+col2[cnt]);
	                //}
					con.close();
					return col1;//"Success";
				//}else {
				//	con.close();
				//	retstring[0]="no";
				//	return retstring;//"no";
				//}
			}catch(Exception err) {System.out.println(err);}
			retstring[0]="null";
			return retstring;//"null";
		}
		retstring[0]="null";
		return retstring;//"null";
	}

}
