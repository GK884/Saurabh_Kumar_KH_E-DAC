package assignment_01;
import java.util.*;
public class Q11 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Radius =");
		float rad=sc.nextFloat();
		System.out.println("Perimeter is ="+2*3.14*rad);
		System.out.println("area is ="+3.14*rad*rad);
		sc.close();
	}
}
