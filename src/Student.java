

import java.util.Scanner;

class StudentDetails{
	
	
	public String name;
	public int usn;
	public float marks;
	public String city;
	public String address;
}

public class Student {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StudentDetails st=new StudentDetails();
		
		System.out.print("Enter student name : ");
		st.name=sc.next();
		System.out.print("Enter usn : ");
		st.usn=sc.nextInt();
		System.out.print("Enter marks : ");
		st.marks=sc.nextFloat();
		System.out.print("Enter city : ");
		st.city=sc.next();
		System.out.print("Enter address : ");
		st.address=sc.next();
		
		System.out.println("=========Student Details=========");
		System.out.println("Name : "+st.name);
		System.out.println("USN : "+st.usn);
		System.out.println("Marks : "+st.marks);
		System.out.println("City : "+st.city);
		System.out.println("Address : "+st.address);
	}
	
}
