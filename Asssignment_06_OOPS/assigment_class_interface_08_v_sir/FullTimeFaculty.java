package assigment_class_interface_08_v_sir;
import java.util.*;
public class FullTimeFaculty extends Faculty
{
	double basicSalary;
	double allowance;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		super.input();
		System.out.println("BASIC SALARY IS : ");
		basicSalary = sc.nextDouble();
		System.out.println("ALLOWANCE IS : ");
		allowance = sc.nextDouble();
		salary = basicSalary + allowance; 
		//System.out.println("SALARY OF FULL TIME FACULTY IS : "+salary );
		anotherFun();
	}
}
