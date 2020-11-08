package assignment_class_interface_09_v_sir;
import java.util.*;
public class Factorial extends Processor
{
	Scanner sc = new Scanner(System.in);
	void process()
	{
		int fact=1;
		System.out.println("ENTER NUMBER FOR FACTORIAL : ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact = fact *i; 
		}
		data=fact;
		System.out.println(data);
		
	}
}