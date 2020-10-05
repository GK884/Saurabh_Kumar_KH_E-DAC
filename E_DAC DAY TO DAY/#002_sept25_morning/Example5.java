package sep25_morning;
import java.util.*;
public class Example5 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num>0)
		{
			int qu=num%2;
			System.out.println(qu);
			num=num/2;
		}
		sc.close();
	}
}
