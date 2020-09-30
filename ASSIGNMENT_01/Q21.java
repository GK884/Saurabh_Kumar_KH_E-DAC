package assignment_01;
import java.util.*;
public class Q21 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("input the decimal number");
		int a=sc.nextInt();
		System.out.println(Integer.toOctalString(a));
		sc.close();
	}
}
