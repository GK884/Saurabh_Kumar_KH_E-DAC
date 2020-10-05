package oct02_morning;

class Employee
{
	private int empId;
	private String empName;
	
	void set(int id, String name)
	{
		/*System.out.println("ID= "+ empId+ " NAME= "+empName);
		int empI=id;
		String empN=name;
		System.out.println("ID= "+ empI+ " NAME= "+empN);*/
		empId=id;
		empName=name;
	}
	
	void display()
	{
		System.out.println("DISPLAY MATHOD ID= "+ empId+ 
				" NAME= "+empName);
	}
}

public class Test03 
{
	public static void main(String[] args)
	{
		Employee t1=new Employee();	//object created
		t1.set(551,"Roshani");		//set() method called 
									//with 2 arguments
		t1.display();				//display() method called
									//with no arguments
	}
}
