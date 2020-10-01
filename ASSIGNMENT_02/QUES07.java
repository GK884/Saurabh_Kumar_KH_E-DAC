package assignment_02;

public class QUES07 
{
	public static void main(String[] args)
	{
		int count=9;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=9;k>=i;k--)
			{
				System.out.print(count+" ");
			}
			System.out.println();
			count--;
		}
	}
}

/*
 * OUTPUT

9 9 9 9 9 9 9 9 9 
 8 8 8 8 8 8 8 8 
  7 7 7 7 7 7 7 
   6 6 6 6 6 6 
    5 5 5 5 5 
     4 4 4 4 
      3 3 3 
       2 2 
        1 
*/