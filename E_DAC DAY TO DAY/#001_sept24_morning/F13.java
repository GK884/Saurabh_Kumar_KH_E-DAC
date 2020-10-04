package sep24_morning;

public class F13
{
	public static void main(String[] args)
	{
		int sp=20;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			sp--;
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*
OUTPUT

                 * 
                * * 
               * * * 
              * * * * 
             * * * * * 
*/