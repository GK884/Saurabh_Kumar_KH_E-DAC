package sep24_morning;
/*
 * printing 2D matrix using for loops
 * in this we will be using nested loop
 */
public class F02 
{
	public static void main(String[] args)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(i+" "+j);
			}
			System.out.println();
		}
	}
}

/*
OUTPUT

0 0
0 1
0 2

1 0
1 1
1 2

2 0
2 1
2 2

*/