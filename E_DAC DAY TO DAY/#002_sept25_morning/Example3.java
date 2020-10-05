package sep25_morning;

public class Example3 {
	public static void main(String[] args)
	{
		int a=4;
		int b=8;
		if((b-a--)>=a)							//if((8-4)>=3)		-->true
		{
			if((b+a)%2==1)						//(8+3)%2==1		-->true
				System.out.println(a*b);		//3*8 = 24
			else
				System.out.println(b+a);
		}
	}
}

/*
OUTPUT
a=3;b=8;

24

*/

/*
 * ++a: pre increment
 * a++: post increment
 * --a: pre decrement
 * a--: post decrement
 * 
 */