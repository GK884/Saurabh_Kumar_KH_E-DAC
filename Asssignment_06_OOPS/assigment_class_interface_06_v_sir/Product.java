//package assigment_class_interface_06_v_sir;
//
//public class Product 
//{
//	int pid;
//	double price;
//	int quantity;
//	static double totamount = 0;
//	Product(int pid, double price, int quantity)
//	{
//		this.pid=pid;
//		this.price=price;
//		this.quantity=quantity;
//	}
//	static void calculate(Product p)
//	{
//		double amount = (p.price * p.quantity);
//		System.out.println("amount is : "+amount);
//		Product.totamount = Product.totamount + amount;
//		System.out.println(Product.totamount);
//	}
//	
//	static void productWithHighestPrice(Product[] p) 
//	{
//		double max=p[0].price;
//		for (int i = 0; i < p.length; i++) 
//		{
//			if(p[i].price>max)max=p[i].price;
//		}
//		System.out.println();
//		System.out.println("Maximum price is := "+max);
//		
//		System.out.println();
//		for (int i = 0; i < p.length; i++) 
//		{
//			if(p[i].price==max) 
//			{
//				System.out.println("The Pid of Highest price is := "+p[i].pid);
//			}
//		}
//		
//	}
//	
//}