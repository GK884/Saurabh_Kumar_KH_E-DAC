package assigment_class_interface_07_v_sir;

public class OneBHK 
{
	double roomArea;
	double hallArea;
	double price;
	public OneBHK() 
	{
		
	}
	OneBHK(double roomArea, double hallArea, double price)
	{
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	void show()
	{
		System.out.println(roomArea);
		System.out.println(hallArea);
		System.out.println(price);
	}
}
