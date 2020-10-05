package oct02_morning;
class Test
{
	int i=10;		//default access specifier
	
	void display()
	{
		System.out.println("IN DISPLAY");
	}

}
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.display();
	}

}
