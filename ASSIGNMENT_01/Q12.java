package assignment_01;
import java.util.*;
public class Q12 
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int no,sum=0;
		System.out.println("enter 3 no.s");
		for(int i=0;i<3;i++)
		{
			no=sc.nextInt();
			sum=sum+no;
		}
		System.out.println("average is ="+(sum/3));
		sc.close();
	}
}
