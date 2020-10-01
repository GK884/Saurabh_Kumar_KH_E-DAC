package assignment_02;

public class QUES01 
{
	public static void main(String[] args)
	{
		int space=10;
		int i,j,k;
		for(i=1;i<=9;i++)
		{
			for(k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			space--;
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" " );
			}
			System.out.println();
		}
	}
}


/*
OUTPUT

			    1 
		     2 2 
		    3 3 3 
		   4 4 4 4 
	  	5 5 5 5 5 
	   6 6 6 6 6 6 
	  7 7 7 7 7 7 7 
	 8 8 8 8 8 8 8 8 
	9 9 9 9 9 9 9 9 9 

*/
