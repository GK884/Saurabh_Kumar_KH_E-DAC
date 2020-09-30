package assignment_01;
import java.util.*;
public class Q24 
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
		System.out.println(dec);
		sc.close();
	}
}
