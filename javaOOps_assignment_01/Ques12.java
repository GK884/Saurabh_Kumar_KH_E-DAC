package javaOOps_assignment_01;
import java.util.*;
public class Ques12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your salary ");
		double bs=sc.nextInt();
		double HRA,DA;
		if(bs < 10000)
		{
			HRA=(bs*0.1);
			DA=(bs*0.9);
		}
		else
		{
			HRA=bs+2000;
			DA=(bs*0.98);
			
			System.out.println("HRA is "+HRA);
			System.out.println("DA is "+DA);
		}
		double gross=bs+HRA+DA;
		System.out.println("the gross salary is "+gross);
		sc.close();
	}
}
