package assignment_class_interface_03_v_sir;

/*
 * 3.	Create a class MathOperation that has four static methods. 
 * 		add() method that takes two integer numbers as parameter and
 * 		returns the sum of the numbers. subtract() method that takes 
 * 		two integer numbers as parameter and returns the difference of 
 * 		the numbers. multiply() method that takes two integer numbers 
 * 		as parameter and returns the product. power() method that takes 
 * 		two integer numbers as parameter and returns the power of first 
 * 		number to second number. Create another class Demo (main class) 
 * 		that takes the two numbers from the user and calls all four 
 * 		methods of MathOperation class by providing entered numbers and 
 * 		prints the return values of every method.
 */
import java.util.*;
public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A VALUE : ");
		int a=sc.nextInt();
		System.out.println("ENTER B VALUE : ");
		int b=sc.nextInt();
		int res1 = MathOperation.add(a, b);
		System.out.println(res1);
		int res2 = MathOperation.subtract(a, b);
		System.out.println(res2);
		int res3 = MathOperation.multiply(a, b);
		System.out.println(res3);
		double res4 = MathOperation.power(a, b);
		System.out.println(res4);
		sc.close();
	}
}
