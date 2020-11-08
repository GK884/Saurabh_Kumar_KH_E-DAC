package assignment_class_interface_02_v_sir;

/*
 * 2.	Create a class Circle that has two data members, 
 * 		one to store the radius and another to store area 
 * 		and three methods first init() method to input 
 * 		radius from user, second calculateArea() method 
 * 		to calculate area of circle and third display() 
 * 		method to display values of radius and area. 
 * 		Create class CircleDemo ( main class) that creates 
 * 		the Circle object and calls init(), calculateArea() 
 * 		and display() methods.
 */
public class CircleDemo {

	public static void main(String[] args) 
	{
		Circle c = new Circle();
		c.calculateArea();
		c.display();
	}

}
