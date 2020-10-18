package javaOOps_assignment_02;
import java.util.*;
public class Ques04 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int sum=12;
		System.out.println(sum);
		for(int i=0;i<num-1;i++)
		{
			sum=sum+10;
			System.out.println(sum);
		}
		sc.close();
	}
}
