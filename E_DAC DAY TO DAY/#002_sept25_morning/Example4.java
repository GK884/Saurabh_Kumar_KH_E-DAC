package sep25_morning;

public class Example4 
{
	public static void main(String[] args)
	{
		int a=12,b=17;
		System.out.println((a+=10)%b);
		a=12;b=17;
		System.out.println(a+(++b));
		a=12;b=17;
		System.out.println(a++ + ++b);
		a=12;
		b=17;
		System.out.println(a+b++);
		a=12;
		b=17;
		System.out.println(++a+a++);
		a=12;
		b=17;
		System.out.println(++a+(++a));
		a=13;
		b=17;
		System.out.println(++a + (a++) + (++a) + (a++));
		System.out.println(a);
	}
}
