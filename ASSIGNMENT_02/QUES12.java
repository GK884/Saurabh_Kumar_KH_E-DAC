package assignment_02;

public class QUES12 {
	public static void main(String[] args)
	{
		int space=6;
		for(int i=0;i<=6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			space--;
			for(int j=0;j<=space;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

/*
 *OUTPUT

 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 
      
*/