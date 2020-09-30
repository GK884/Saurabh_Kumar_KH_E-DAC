package assignment_01;
import java.util.*;
public class Q15 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no 1:");
		int a=sc.nextInt();
		System.out.println("enter no 2:");
		int b=sc.nextInt();
		System.out.println("two no.s are "+a+" "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("Two no.s with swap are "+a+" "+b);
		sc.close();
	}
}
