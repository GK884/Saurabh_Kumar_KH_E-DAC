package assigment_class_interface_01_v_sir;
import java.util.*;
public class Student 
{
	int rollno;
	String name;
	Scanner sc = new Scanner(System.in);
	void setData(int roll, String nm)
	{
		//System.out.println("Enter Rollno : ");
		rollno = roll;
		//System.out.println("Enter name : ");
		name=nm;
	}
	void showData()
	{
		System.out.println("Rollno is : "+ rollno);
		System.out.println("Name is : "+name);
	}
}
