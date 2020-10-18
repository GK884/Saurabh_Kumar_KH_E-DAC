package javaOOps_assignment_01;
import java.util.*;
public class Ques11 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST ELEMENT: ");
		int a=sc.nextInt();
		System.out.println("ENTER SECOND ELEMENT: ");
		int b=sc.nextInt();
		System.out.println("NUMBERS WITHOUT SWAP: "+a +" "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("\n\nNUMBER WITH SWAP: "+a + " "+ b);
		sc.close();
	}
}
