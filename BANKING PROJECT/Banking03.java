package assignment_03_BANKING;

import java.util.Scanner;

public class Banking03 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Banking03_1 B=new Banking03_1();
		char ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n\n\t\t\tWELCOME to HOUSE BANK");
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("\n1. CREATE ACCOUNT");
			System.out.println("2. CHECK AMOUNT");
			System.out.println("3. DEPOSIT AMOUNT");
			System.out.println("4. WITHDRAWL AMOUNT");
			System.out.println("\nKEYS :\t1\t2\t3\t4");
			int w_choice=sc.nextInt();
			switch(w_choice)
			{
				case 1: 
					{
						if(B.counter==0)
						{
							B.createAccount();
							B.counter++;
						}
						else if(B.counter>0)
						{
							System.out.println("TRYING TO MAKE MULTIPLE ACCOUNTS");
							System.out.println("SORRY NOT POSSIBLE");
							break;
						}
					}
					break;
				
				case 2:
					{
						if(B.counter>0)
						{
							B.checkAmount();
							B.counter++;
						}
						else if(B.counter==0)
						{
							System.out.println("NO ACCOUNT CREATED");
							System.out.println("SORRY NOT POSSIBLE");
							break;
						}
					}
					break;
				
				case 3:
					{
						if(B.counter>0)
						{
							B.depositAmount();
							B.counter++;
						}
						else if(B.counter==0)
						{
							System.out.println("NO ACCOUNT CREATED");
							System.out.println("SORRY NOT POSSIBLE");
							break;
						}
					}
					break;
				
				case 4:
					{
						if(B.counter>0)
						{
							B.withdrawlAmount();
							B.counter++;
						}
						else if(B.counter==0)
						{
							System.out.println("NO ACCOUNT CREATED");
							System.out.println("SORRY NOT POSSIBLE");
							break;
						}
					}
					break;
				default:
					System.out.println("\nSORRY...!!! YOU ENTERERD A WRONG CHOICE");
			}	
			System.out.println("\nDo you want of to continue (Y or N)");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("\n\nTHANKYOU FOR VISITING US");
		sc.close();
	}
}
