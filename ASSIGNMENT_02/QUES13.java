package assignment_02;

public class QUES13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
        for(i=0;i<6;i++)
        {
        	for(j=6;j>i;j--)
        		System.out.print("  ");
            for(k=i;k>=0;k--)
            {
                if(i>0 && i<5)
                {
                        if(k==i || k==0)
                        System.out.print(" *  ");    
                        else
                        System.out.print("    ");
                }
                else
                        System.out.print(" *  ");
            }
            System.out.println();
        }
	}

}

/*
 * OUTPUT
  
             *  
           *   *  
         *       *  
       *           *  
     *               *  
   *   *   *   *   *   *  

*/