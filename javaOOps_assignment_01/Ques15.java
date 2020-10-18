package javaOOps_assignment_01;
import java.util.*;
public class Ques15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR GENDER AS (M/F)");
		char ch=sc.next().charAt(0);
		System.out.println("GENDER IS "+ ch);
		System.out.println("ENTER YOUR AGE");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("eligible for marriage");
		}
		else
			System.out.println("not eligible for marriage");
		sc.close();
	}
}
