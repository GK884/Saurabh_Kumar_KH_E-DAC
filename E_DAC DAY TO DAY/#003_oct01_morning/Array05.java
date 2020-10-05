package oct01_morning;

public class Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// [] ---->1D array ----> row / column
		int a[]= {1,2,3};				// 1D array
		int b[]= {1,2,3};				// 1D array
		int c[]= {1,2,3};				// 1D array
		
		// [][]---->2D array ----> rows and column / column and rows
		int a1[][]=new int[3][];		// 2D array
		
		a1[0]=a;
		a1[1]=b;
		a1[2]=c;
		
		//without array.length
		
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//with array.length
		
		/*for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1.length;j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}*/
		
		//with for-each loop
		/*int i,j;
		for(i : a1[i][j])
		{
			for(j : a1[i][j])
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		}*/
	}

}
