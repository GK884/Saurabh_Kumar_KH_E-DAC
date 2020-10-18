package javaOOps_assignment_01;
import java.util.*;
public class Ques06 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS");
		int rad=sc.nextInt();
		double area=3.14*rad*rad;
		double per=2*3.14*rad;
		System.out.println("AREA IS : "+area);
		System.out.println("PERIMETER IS : "+per);
		sc.close();
	}
}
