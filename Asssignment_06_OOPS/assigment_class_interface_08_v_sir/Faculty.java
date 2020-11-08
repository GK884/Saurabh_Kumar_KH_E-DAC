package assigment_class_interface_08_v_sir;
import java.util.*;
public class Faculty 
{
	Scanner sc = new Scanner(System.in);
	int facultyid;
	double salary;
	
	void input()
	{
		System.out.println("Faculty id : ");
		facultyid=sc.nextInt();
	}
	
	void anotherFun()
	{
		System.out.println("SALARY IS : "+salary);
	}
	
}
