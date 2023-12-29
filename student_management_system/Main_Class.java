package student_management_system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_Class {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//System.out.print("hi");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		
		while(true) {
			System.out.println("press 1 for create a new student");
			System.out.println("press 2 for delete a student");
			System.out.println("press 3 for show student list");
			System.out.println("press 4 for exit from the system");
			int input=Integer.parseInt(br.readLine());
			if(input==1) {
				// add operation
				System.out.println("Enter the new username here");
				String name=br.readLine();
				System.out.println("Enter the new user phone number here");
				String phone=br.readLine();
				System.out.println("Enter the new user email id here");
				String email=br.readLine();
				System.out.println("Enter the new user city here");
				String city=br.readLine();
				studentClass st=new studentClass(name,phone,email,city);
				boolean result=StudentDao.insertStudentDb(st);
				if(result) {
					System.out.println("Successfully insert the new student data.....");
				}
				else {
					System.out.println("oops something went wrong.......");
				}
				//System.out.println(st);
			}
			else if(input==2) {
				//delete operation
				System.out.println("enter the student id for delete");
				int id=Integer.parseInt(br.readLine());
				boolean result=StudentDao.deleteStudentDb(id);
				if(result) {
					System.out.print("Deleted successfully......");
				}
				else {
					System.out.print("oops something not deleted.....");
				}
			}
			else if(input==3) {
				//display operation
				boolean result=StudentDao.displayStudent();
				if(!result) {
					System.out.println("Student list is empty.......");
				}
			}
			else if(input==4) {
				//exit
				break;
			}
			else {
				//System.out.print("thank you fro your interest");
			}
		}
		System.out.print("thank you for your interest");
		
		

	}

}
