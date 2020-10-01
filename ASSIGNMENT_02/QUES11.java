package assignment_02;

public class QUES11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=6;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			space--;
			for(int j=1;j<=i;j++)
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

*/