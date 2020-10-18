package javaOOps_assignment_01;
import java.util.*;
public class Ques09 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER OF DAYS :");
		int days=sc.nextInt();
		int years=(int)days/365;
		System.out.println("NUMBER OF YEARS ARE :"+ years);
		int months=(int)days/7;
		System.out.println("NUMBER OF MONTHS ARE :"+ months);
		int dayofyear=days%365;
		System.out.println("Day of CURRENT year is :"+ dayofyear);
		int monthofyear=dayofyear/30+1;
		System.out.println("Month of CURRENT year is :"+ monthofyear);
		sc.close();
	}
}
