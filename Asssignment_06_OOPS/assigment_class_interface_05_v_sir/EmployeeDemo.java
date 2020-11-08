package assigment_class_interface_05_v_sir;

/*
 * 5.	Create a class Employee with three data members (empNo, salary and totalSalary)
 *  	and following features.
 *	a.	Only parameterized constructor. [Do not overload the constructor]
 *	b.	totalSalary always represents salary total of all the employees created.
 *	c.	empNo should be auto incremented.
 *	d.	display total employees and totalSalary using a method.
 *		
 *		Create another class EmployeeDemo (main class) that creates some 
 *		Employee objects and calls Employee method to display no. of employees 
 *		and total of their salaries.
 */

import java.util.*;
public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee[] e = new Employee[5];
		for(int i = 0 ; i < 5 ; i++)
		{
			
			e[i] = new Employee(sc.nextDouble());
			e[i].display();
		}
		sc.close();
	}
}
