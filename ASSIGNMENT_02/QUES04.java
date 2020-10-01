package assignment_02;

public class QUES04 
{
	public static void main(String args[])
	{
		int i,j,k;
		int space=20;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space--;
			space--;
			for(k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			for(k=i-1;k>=1;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}

/*
 * OUTPUT

                    1 
                  1 2 1 
                1 2 3 2 1 
              1 2 3 4 3 2 1 
            1 2 3 4 5 4 3 2 1 
          1 2 3 4 5 6 5 4 3 2 1 
        1 2 3 4 5 6 7 6 5 4 3 2 1 
      1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
    1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 

*/
