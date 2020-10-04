package sep24_morning;

public class F12 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			//FOR SPACES
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			/*PRINT    *
					  **
					 ***
					****
			*/
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			/*PRINT 
					    *
					    **
					    ***
			*/
			for(int l=2;l<=i;l++)
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
  ***
 *****
*******

*/