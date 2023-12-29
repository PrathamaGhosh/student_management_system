package student_management_system;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_class {
	static Connection con;
public static Connection createConnection(){
	
	try{
		//load the driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create Connection
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management","root","sql990");	
	}
	
	catch(Exception e) {
		e.printStackTrace();
	}
	
	return con;
}
}
