package oct03_morning;

public class String03 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char c[]= {'J','A','V','A'};
		String s= "Java";
		String s2=new String(c);
		String s3=new String(s2);	
		System.out.println(s);		//Java
		System.out.println(s2);		//JAVA
		System.out.println(s3);		//JAVA
	}

}
