package assigment_class_interface_01_v_sir;
import java.util.*;

/*
 *1.	Create a class Student with 2 data members rollno and name. 
 *		Create one method setData() that takes roll number and student name 
 *		as parameter and stores them in data members rollno and name. 
 *		Create one more method showData() to print the data member values.
 *		Create another class ( main class) StudentDemo that creates 
 *		Student class object and calls setData() and showData() methods.
 * 
 */
public class StudentDemo 
 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student s = new Student();
		System.out.println("enter ROLL NO : ");
		int roll=sc.nextInt();
		sc.nextLine();
		System.out.println("enter NAME : ");
		String nm=sc.nextLine();
		
		s.setData(roll, nm);
		s.showData();
		sc.close();
	}
}
