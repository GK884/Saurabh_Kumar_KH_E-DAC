package javaOOps_assignment_02;
import java.util.*;
public class Ques08 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int p=arr.length-1;
		for(int i=0;i<(arr.length)/2;i++)
		{
			int n=arr[i];
			arr[i]=arr[p];
			arr[p]=n;
			p--;
		}
		for(int i=0;i<arr.length;i++)
			System.out.println("arr["+i+"] = "+arr[i]);
		sc.close();
	}
}
