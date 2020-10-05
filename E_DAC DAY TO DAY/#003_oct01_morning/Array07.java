package oct01_morning;
import java.util.*;
public class Array07 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//DOING TRANSPOSE OF A MATRIX
		
		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		int[][] b=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		//MY ARRAY WITHOUT TRANSPOSE
		
		System.out.println("ARRAY WITHOUT TRANSPOSE");
		for(int[] i : a)		//for(int i=0;i<3;i++)
		{
			for(int j : i)		//for(int j=0;j<3;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//MY ARRAY WITH TRANSPOSE
		
		System.out.println("ARRAY with TRANSPOSE");
		/*for(int[] i : a)*/		for(int i=0;i<3;i++)
		{
			/*for(int[] j : a)*/		for(int j=0;j<3;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for(int[] i : b)		//for(int i=0;i<3;i++)
		{
			for(int j : i)		//for(int j=0;j<3;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
