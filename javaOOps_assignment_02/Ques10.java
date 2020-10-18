package javaOOps_assignment_02;

import java.util.Scanner;

public class Ques10 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("ENTER ELEMENTS OF ARRAY");
		int sumE=0;
		int sumO=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]%2==0)
				sumE=sumE+a[i];
			else
				sumO=sumO+a[i];
		}
		System.out.println("SUM OF EVEN IS "+sumE);
		System.out.println("SUM OF ODD IS "+sumO);
		sc.close();
	}
}
