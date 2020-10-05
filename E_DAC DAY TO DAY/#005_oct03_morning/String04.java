package oct03_morning;

public class String04 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		byte ascii[]= {65,66,67,68,69,70};
		String s1=new String(ascii);
		System.out.println(s1+" ");	//ABCDEF
		
		String s2=new String(ascii,2,2);
		System.out.println(s2);
	}
}


//String of 10 and sort in ascending
//String searching in array