package assignment_01;
import java.util.*;
public class Q13 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter width");
		float width=sc.nextFloat();
		System.out.println("Enter height");
		float height=sc.nextFloat();
		System.out.println("Area is ="+width*height);
		System.out.println("Perimeter is ="+(2*(width+height)));
		sc.close();
	}

}
