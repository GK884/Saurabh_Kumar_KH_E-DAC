package sep24_morning;
public class F15 
{
	public static void main(String[] args)
	{
		int space=20;
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			space--;
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		space=20;
		for(i=4;i>=1;i--)
		{
			for(k=4;k<=space;k++)
			{
				System.out.print(" ");
			}
			space++;
			for(j=1;j<=i;j++)
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
               * * * * 
                * * * 
                 * * 
                  * 

*/