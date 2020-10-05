package oct03_morning;
public class Box02 
{
	double depth;				//value 0 assigned at compile time
	double height;
	double width;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Box02 b=new Box02();	//object created at runtime
		Box02 b2=new Box02();
		double vol;
		
		b.depth=10;
		b.height=20;
		b.width=30;
		
		vol=b.depth*b.height*b.width;
		System.out.println(vol);
		
		b2.depth=10.3;
		b2.height=20.5;
		b2.width=30;
		
		vol=b2.depth*b2.height*b2.width;
		System.out.println(vol);
	}
}
