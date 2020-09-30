package assignment_01;
import java.util.Scanner;
public class Q23 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int dec=0,n=0;
		while(num>=1)
		{
			int rem=num%10;
			dec=dec+(rem*(int)Math.pow(2,n));
			n++;
			num=num/10;
		}
		if(dec==10)
		{
			System.out.println("A");
		}
		else if(dec==11)
		{
			System.out.println("B");
		}
		else if(dec==12)
		{
			System.out.println("C");
		}
		else if(dec==13)
		{
			System.out.println("D");
		}
		else if(dec==14)
		{
			System.out.println("E");
		}
		else if(dec==15)
		{
			System.out.println("F");
		}
		else
			System.out.println(dec);
		sc.close();
	}
}
