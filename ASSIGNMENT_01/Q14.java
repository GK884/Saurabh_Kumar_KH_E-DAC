package assignment_01;
public class Q14 
{
	public static void main(String[] args)
	{
		for(int i=0;i<9;i++)
		{
			
			if(i%2==0)
			{
				for(int j=0;j<6;j++)
				{
					System.out.print("* ");
				}
				for(int k=0;k<20;k++)
				{
					System.out.print("=");
				}
			}
			else if(i%2!=0)
			{
				for(int j=0;j<5;j++) 
				{
					System.out.print(" *");
				}
				System.out.print(" ");
				for(int k=0;k<21;k++)
				{
					System.out.print("=");
				}
			}
		System.out.println("\n");
		}
		for(int k=0;k<10;k++)
		{
			for(int j=0;j<32;j++)
			{
			System.out.print("=");
			}
			System.out.println("\n");
		}
	}
}
