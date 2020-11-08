package assignment_class_interface_09_v_sir;
import java.util.*;
public class Circle extends Processor 
{
	Scanner sc = new Scanner(System.in);
	void process()
	{
		System.out.println("ENTER RADIUS : ");
		int radius = sc.nextInt();
		double area = 3.14*radius*radius;
		//data=area;
		System.out.println("AREA IS : "+area);
	}
}
