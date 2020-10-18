package javaOOps_assignment_01;
import java.util.*;
public class Ques08 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("ENTER PRINCIPLE AMOUNT :");
		double pri=sc.nextDouble();
		System.out.println("ENTER RATE OF INTEREST :");
		double intr=sc.nextDouble();
		System.out.println("ENTER TIME IN MONTHS :");
		double time=sc.nextDouble();
		double simpleI=(pri*intr*time)/100;
		System.out.println("SIMPLE INTEREST IS :"+simpleI);
		sc.close();
	}
}
