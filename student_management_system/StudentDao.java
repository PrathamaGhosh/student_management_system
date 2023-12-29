package student_management_system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.cj.xdevapi.Statement;

public class StudentDao {
	public static boolean insertStudentDb(studentClass st) {
		boolean flag=false;
		try {
			Connection con=Connection_class.createConnection();
			String query="insert into student(sname,sphone,semailid,scity) values(?,?,?,?)";
			//execute the statement
			PreparedStatement ps=con.prepareStatement(query);
			//set the values of new student
			ps.setString(1, st.getStudentName());
			ps.setString(2,st.getStudentPhone());
			ps.setString(3, st.getStudentEmail());
			ps.setString(4, st.getStudentCity());
			
			//execute the query not expecting data
			ps.executeUpdate();
			flag=true;
			
		}catch(Exception e) {
			e.printStackTrace();		
		}
		return flag;
	}

	public static boolean deleteStudentDb(int id) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			Connection con=Connection_class.createConnection();
			String query="delete from student where sid=?";
			PreparedStatement ps=con.prepareStatement(query);
			//set the values of new student
			ps.setInt(1,id);
			 
			
			//execute the query not expecting data
			ps.executeUpdate();
			flag=true;
			
		}catch(Exception e) {
			e.printStackTrace();		
		}
		return flag;
		
	}

	public static boolean displayStudent() {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			Connection con=Connection_class.createConnection();
			String query="select * from student";
			//PreparedStatement ps=con.prepareStatement(query);
			//set the values of new student
			PreparedStatement st= con.prepareStatement(query);
			//ps.setInt(1,id);
			ResultSet rs=st.executeQuery(query);
			 
			
			//execute the query not expecting data
			//ps.executeUpdate();
			//flag=true;
			//boolean flag=false;
			while(rs.next()) {
//				int id=rs.getInt(1);
//				String name=rs.getString(2);
//				String phone=rs.getString(3);
//				String email=rs.getString(4);
//				String city=rs.getString(5);
				System.out.println("ID is :"+rs.getInt(1));
				System.out.println("Name is :"+rs.getString(2));
				System.out.println("Phone is :"+rs.getString(3));
				System.out.println("city is :"+rs.getString(5));
				System.out.println("------------------------");
				flag=true;
				
			}
			 
			
			
		}catch(Exception e) {
			e.printStackTrace();		
		}
		return flag;
	}

}
