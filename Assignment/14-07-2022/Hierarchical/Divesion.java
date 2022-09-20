package demo;

public class Divesion extends Hierarchical
{
	public void division() 
	{
		accept();
		
		//perform division operation
		int div=(x/y);
		System.out.println("divisionof two numbers is:"+div);
		
	}

	public static void main(String[]args) {
		Divesion obj=new Divesion();
		obj.division();
	}
}
