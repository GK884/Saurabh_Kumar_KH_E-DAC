package sep24_morning;

public class F08 
{
	public static void main(String[] args)
	{
		int sum=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(sum+" ");
				sum++;
			}
			System.out.println();
		}
	}
}

/*
OUTPUT

1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

*/