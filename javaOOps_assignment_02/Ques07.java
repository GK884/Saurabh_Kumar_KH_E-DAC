package javaOOps_assignment_02;
import java.util.*;
public class Ques07 
{
	//7.	Sort ten element array in descending order AND ascending order.
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH OF THE ARRAY");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE ARRAY ELEMENT :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("ELEMENTS OF ARRAY ARE :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+"= "+a[i]);
		}
		for(int j=0;j<a.length-1;j++)
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i] > a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		System.out.println("ASCENDING ORDER IS: ");
		for(int i=0;i<a.length;i++)
			System.out.println(i+"= "+a[i]);
		
		for(int j=0;j<a.length-1;j++)
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i] < a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		System.out.println("DESCENDING ORDER IS: ");
		for(int i=0;i<a.length;i++)
			System.out.println(i+"= "+a[i]);
		
		sc.close();
	}
}
