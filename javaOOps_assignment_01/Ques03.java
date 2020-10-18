package javaOOps_assignment_01;
public class Ques03 
{
	static  void expression()
	{
        boolean x = true;
        boolean y = false;


        boolean z = x && y || !(x || y);
        System.out.println("Value of z is " + z);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x=1;
		int y = (int)(Math.pow(x,2) + (3*x) - 7);
		System.out.println(y);
		y=x++ + ++x + x++;
		System.out.println("VALUE OF Y IS"+y);
		int z = x++ - --y - --x  +  x++;
		System.out.println(z);
		expression();	
	}
}