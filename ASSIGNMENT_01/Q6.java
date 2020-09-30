package assignment_01;
import java.util.*;
public class Q6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number");
		int a=sc.nextInt();
		System.out.println("Input second number");
		int b=sc.nextInt();
		System.out.println("Expected output");
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+a*b);
		System.out.println(a+"/"+b+"="+a/b);
		sc.close();
	}

}
