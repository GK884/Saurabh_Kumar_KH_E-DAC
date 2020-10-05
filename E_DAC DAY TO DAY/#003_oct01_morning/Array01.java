package oct01_morning;
import java.util.*;
public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []a=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter integer value "+i);
			a[i]=sc.nextInt();
		}
		for(int num : a)
		{
			System.out.println("Element is "+num);
		}
		sc.close();
	}

}
