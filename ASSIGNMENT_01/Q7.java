package assignment_01;
import java.util.*;
public class Q7 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a number:");
		int a=sc.nextInt();
		for(int i=1;i<11;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
		sc.close();
	}
}
