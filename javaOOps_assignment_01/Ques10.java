package javaOOps_assignment_01;
import java.util.*;
public class Ques10 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of Fahrenheit ");
		int fer=sc.nextInt();
		int cel=5*(fer-32)/9;
		System.out.println("CONERSION IN CELSIUS IS "+ cel);
		sc.close();
	}
}