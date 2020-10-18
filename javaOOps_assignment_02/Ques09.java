package javaOOps_assignment_02;
import java.util.*;
public class Ques09 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("ENTER ELEMENTS IN ARRAY");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("ENTER KEY TO FOUND");
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				System.out.println("FOUND");
			}
			/*
			 * else 
			 * 	System.out.println("NOT FOUND");
			 */
		}
		sc.close();
	}

}
