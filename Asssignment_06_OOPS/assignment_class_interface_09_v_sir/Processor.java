package assignment_class_interface_09_v_sir;

public abstract class Processor 
{
	double data;
	
	void showData()
	{
		System.out.println(data);
	}
	abstract void process();
}
