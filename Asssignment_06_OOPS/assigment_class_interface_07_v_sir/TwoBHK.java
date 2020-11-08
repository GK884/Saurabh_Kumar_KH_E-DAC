package assigment_class_interface_07_v_sir;

public class TwoBHK extends OneBHK
{
	double room2Area;
	TwoBHK()
	{
		
	}
	TwoBHK(double roomArea, double hallArea, double price, double room2Area)
	{
		super(roomArea, hallArea, price);
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
		this.room2Area = room2Area;
	}
	void show()
	{
		//super.show();
		System.out.println(roomArea);
		System.out.println(hallArea);
		System.out.println(price);
		System.out.println(room2Area);
	}
}
