package assignment_class_interface_02_v_sir;
import java.util.*;
public class Circle 
{
	int radius;
	double area;
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		radius = sc.nextInt();
		sc.close();
	}
	void calculateArea()
	{
		area = 3.14 * radius * radius;
	}
	void display()
	{
		System.out.println("Radius is : "+radius);
		System.out.println("Area is : "+area);
	}
}
