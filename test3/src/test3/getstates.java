package test3;

import java.io.BufferedReader;
import java.io.FileReader;

public class getstates {
	static String[] getStates() {
		String line = "";
		String[] retstring = ManageStateDatabase.addStatesDatabase("check","","",null,null);
		System.out.println(retstring[0]);
		if(retstring[0]== "no") {
			//File file = new File("C:\\Users\\SHUHA\\Downloads\\statenames.txt");
			//Scanner scan = new Scanner(file);
			//while(scan.hasNextLine()) {
			//	System.out.println(scan.nextLine().split("\t"));
			//}
			try{
				//String url = "jdbc:mysql://localhost:3306/states";
				//Connection conn ConnectMySql.getConnection(url);
				String path = "C:\\Users\\SHUHA\\Downloads\\statenames.txt";
			    BufferedReader br = new BufferedReader(new FileReader(path));
			    while((line = br.readLine())!= null) {
				   String[] values = line.split("\t");
				   //System.out.println(values[0]+"--"+values[1]);
				   ManageStateDatabase.addStatesDatabase("", values[0], values[1],null,null);
				}
			    return null;
			}catch(Exception err) {System.out.println(err);}
		}else {
			 //
			 String[] col1 = new String[230];
			 String[] col2 = new String[230];
			 String[] retcol1 = ManageStateDatabase.addStatesDatabase("read", "", "",col1,col2);
		//	 System.out.println(retcol1[0]+"$$");
			 //System.out.println(col1);
			 //System.out.println(col2);
	         return retcol1;
		}
		return null;

	}


}
