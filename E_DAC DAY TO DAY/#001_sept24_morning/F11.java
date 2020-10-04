package sep24_morning;

public class F11 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=0;k<=i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


/*
OUTPUT

*
**
***
****
*****
****
***
**
*

*/