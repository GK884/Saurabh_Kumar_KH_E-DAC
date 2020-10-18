package javaOOps_assignment_02;
import java.util.*;
public class Ques06 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		System.out.println("ENTER ELEMENTS OF ARRAY");
		int sum=0;
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("SUM IS "+sum);
		sc.close();
	}
}
