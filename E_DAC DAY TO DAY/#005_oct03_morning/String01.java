package oct03_morning;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="New Delhi";
		String s3="Mumbai";
		String s4=s1+s2;
		System.out.println(s4);
		System.out.println(s4+ "and"+ s3);
		System.out.println(s4.length());
		System.out.println(s4.charAt(6));
		if(s4.equals(s3))
		{
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("NOT EQUAL");
		}
		if(s4 != s3)
		{
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("NOT EQUAL");
		}
		if(s4.charAt(1)== (s3.charAt(1)))
		{
			System.out.println("EQUAL");
		}
		else
		{
			System.out.println("NOT EQUAL");
		}	
	}
}
