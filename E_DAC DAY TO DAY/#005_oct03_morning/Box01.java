package oct03_morning;

public class Box01 
{
	double depth;				//value 0 assigned at compile time
	double height;
	double width;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Box01 b=new Box01();	//object created at runtime
		double vol;
		
		b.depth=10;
		b.height=20;
		b.width=30;
		
		vol=b.depth*b.height*b.width;
		System.out.println(vol);
	}

}
