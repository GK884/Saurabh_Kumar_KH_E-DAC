package javaOOps_assignment_02;

import java.util.Scanner;

public class Ques03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int count=0;
		for(int div=2;div*div<=num;div++)
		{
			if(num%div==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("prime number");
		}
		else
			System.out.println("non prime number");
		sc.close();
	}

}
