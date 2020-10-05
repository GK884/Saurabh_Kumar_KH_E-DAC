package oct01_morning;
import java.util.*;
public class While01 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int a= sc.nextInt();		//initialization
		while(a<10)					//condition
		{
			System.out.print(a);
			a++;					//inc/dec
		}
		sc.close();
	}

}
