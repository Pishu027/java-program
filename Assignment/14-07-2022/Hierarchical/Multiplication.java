package demo;

public class Multiplication extends Hierarchical
{
	public void multiplication() 
	{
		accept();
		
		//perform multiplication operation
		int multi=(x * y);
		System.out.println("Multiplication of two number is:"+multi);
	}
	public static void main(String[]args) {
		Multiplication obj=new Multiplication();
		obj.multiplication();
	}
}
