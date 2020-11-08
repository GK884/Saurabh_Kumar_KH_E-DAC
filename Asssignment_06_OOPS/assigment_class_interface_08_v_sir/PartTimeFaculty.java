package assigment_class_interface_08_v_sir;
import java.util.*;
public class PartTimeFaculty extends Faculty
{
	int workingHours;
	int ratePerHour;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		super.input();
		System.out.println("WORKING HOURS IS : ");
		workingHours = sc.nextInt();
		System.out.println("RATE PER HOURS IS : ");
		ratePerHour = sc.nextInt();
		salary = workingHours * ratePerHour;
		//System.out.println("SALARY OF PART TIME FACULTY IS : "+salary );
		anotherFun();
	}
}
