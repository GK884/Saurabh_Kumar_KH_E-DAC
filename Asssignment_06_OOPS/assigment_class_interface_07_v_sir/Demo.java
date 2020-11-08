package assigment_class_interface_07_v_sir;
/*
 * 07.	Create a class OneBHK with instance variables roomArea, hallArea and price. 
 * 		Then create default constructor that initializes instance variables with some values 
 * 		and a parameterized constructor that takes values for all instance variables and 
 * 		stores them in instance variables. Now create a method named show()  to print OneBHK’s instance 
 * 		variable values.
 * 		Create another class TwoBHK which has (inherits) all the properties and behaviors of 
 *		OneBHK and a new instance variable room2Area. 
 * 		Then create default constructor to initialize all 4 instance variables and a parameterized
 * 		constructor to take the values for initialization of all instance variables. 
 * 		Override show() method to print all data member information.
 * 		Write main method in another class (Say Demo) and store three TwoBHK flat’s information 
 * 		and print information using show method. Also print total amount of all flats.
 *
 */
import java.util.*;
public class Demo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TwoBHK[] t = new TwoBHK[3];
		double total=0;
		for(int i=0; i<3; i++)
		{
			
			System.out.println("room area : ");
			double roomArea=sc.nextDouble();
			System.out.println("hall area : ");
			double hallArea=sc.nextDouble();
			System.out.println("price : ");
			double price=sc.nextDouble();
			System.out.println("room 2 area : ");
			double room2Area=sc.nextDouble();
			t[i] = new TwoBHK(roomArea, hallArea, price, room2Area);
			t[i].show();
			total = total+t[i].price;
		}
		System.out.println(total);
		sc.close();
	}
}
