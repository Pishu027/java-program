package demo;

public class Modulous extends Hierarchical 
{
	public void modulous() 
	{
		accept();
		
		//perform modulo operation
		int mod=(x % y);
		System.out.println("The reminder is:"+mod);
	}
	public static void main(String[]args) {
		Modulous obj=new Modulous();
		obj.modulous();
	}
}
