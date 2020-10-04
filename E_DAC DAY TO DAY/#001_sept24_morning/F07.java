package sep24_morning;

public class F07 
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			int sum=0;
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
				sum=sum+j;
			}
			System.out.print(" "+sum);
			System.out.println();
		}
	}
}
/*
1 1
12 3
123 6
1234 10
12345 15
*/