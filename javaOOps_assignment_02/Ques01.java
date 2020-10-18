package javaOOps_assignment_02;
import java.util.*;
public class Ques02 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int num=sc.nextInt();
		while(num>0)
		{
			int div=num%10;
			num=num/10;
			System.out.print(div);
		}
		sc.close();
	}
}
