package demo;

public class Substract extends Hierarchical
{
	public void substract() 
	{
		accept();
		
		//perform subtract operation
		int sub=(x - y);
		System.out.println("sustraction of two number is:"+sub);
	}
	public static void main(String[]args) {
		Substract obj=new Substract();
		obj.substract();
		
	}
}
