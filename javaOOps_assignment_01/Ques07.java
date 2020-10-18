package javaOOps_assignment_01;
import java.util.*;
public class Ques07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of a student");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		int m5=sc.nextInt();
		int sum=m1+m2+m3+m4+m5;
		System.out.println("TOTAL NUMBER OF MARKS HE SCORED IS :"+sum);
		double per=(sum*100)/500;
		System.out.println("STUDENT PERCENTAGE IS :"+per+"%");
		sc.close();
	}

}
