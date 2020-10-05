package oct01_morning;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int a= sc.nextInt();		//initialization
		do					
		{
			System.out.print(a);
			a++;					//inc/dec
		}while(a<11);				//condition
		sc.close();
	}

}
