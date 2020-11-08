package assignment_class_interface_09_v_sir;
import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER YOUR CHOICE : ");
		System.out.println("1 for factorial, 2 for circle area");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				Factorial f = new Factorial();
				f.process();
			}
			break;
			case 2:
			{
				Circle c = new Circle();
				c.process();
			}
			break;
			default : 
				System.out.println("wrong choice");
		}
		sc.close();
	}
}
