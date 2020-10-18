package javaOOps_assignment_02;
import java.util.*;
public class Ques05 
{	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lower limit");
		int low=sc.nextInt();
		System.out.println("enter higher limit");
		int high=sc.nextInt();
		for(int n=low;n<=high;n++)
		{
			int count=0;
			for(int div=2;div*div<=n;div++)
			{
				if(n%div==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(n);
		}
		sc.close();
	}
}
