package javaOOps_assignment_01;
import java.util.*;
public class Ques13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER 3 number");
		int f=sc.nextInt();
		int s=sc.nextInt();
		int t=sc.nextInt();
		if(f >= s && f >= t)
		{
			System.out.println("first is greatest");
		}
		else if(s >= t)
		{
			System.out.println("second is greatest");
		}
		else
			System.out.println("third is greatest");
		sc.close();
		
		int r=(((f>s)&&(f>t))?f:(s>t)?s:t);
		System.out.println(r+" is greatest");
	}
}
