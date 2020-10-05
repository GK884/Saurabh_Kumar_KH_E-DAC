package oct01_morning;
import java.util.*;
public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printing sum to 5 no.s using for-each loop
		
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		int sum=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("enter no in "+i);
			a[i]=sc.nextInt();
		}
		
		System.out.println("showing no");
		
		//USING "for-each loop"
		
		for(int num : a)
		{
			sum=sum+num;
		}
		System.out.println("sum is "+sum);
		sc.close();	
	}
}
