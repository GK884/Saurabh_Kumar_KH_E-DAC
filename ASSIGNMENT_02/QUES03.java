package assignment_02;

public class QUES03 
{
	public static void main(String[] args)
	{
		int space=20;
		int i=1,j=1,k=1;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space--;
			for(k=1;k<=i;k++)
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
		   * * * * * * 
		  * * * * * * * 
		 * * * * * * * * 
		* * * * * * * * * 

*/
