package oct02_morning;

public class Test01 
{
	int i=10;	//instance variable
	
	private int j=10;	//instance variable with 
						//private access specifier
						//private variable cannot 
						//be seen by other class
	boolean display()
	{
		System.out.println("hello CDAC...");
		return true;
	}
	
	int show()
	{
		int x=10;
		System.out.println("IN SHOW is HERE "+x);
		return x;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test01 t = new Test01();
		/*
		 * t			//it is OBJECT of class Test01
		 * 
		 * Test01();	//it is constructor 
		 * 				//which initialize the
		 * 				//default value into the 
		 * 				//instance variable, when 
		 * 				//value is not defined
		 */
		System.out.println(t.i +" "+ t.j);
		System.out.println("CALLING DISPLAY");
		t.display();
		System.out.println(t.display());
		System.out.println("CALLED DISPLAY");
		//void z=t.display();
		System.out.println("IN MAIN SHOW METHOD "+ t.show());
	}
}
