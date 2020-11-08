package assigment_class_interface_05_v_sir;

public class Employee 
{
	int empNo;
	double salary;
	double totalSalary;
	public Employee(double salary) 
	{
		this.salary = salary;
		empNo++;
		totalSalary=12*salary;
	}
	void display()
	{
		System.out.println("EMPLOYEE : "+empNo);
		System.out.println("EMPLOYEE TOTAL SALARY : "+totalSalary);
	}
	
}
