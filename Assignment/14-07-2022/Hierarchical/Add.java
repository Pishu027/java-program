package demo;

public class Add extends Hierarchical 
{
	public void add() 
	{
		 accept();
		 
		 //perform add operation
		 int sum=(x + y);
		 System.out.println("sum of two number is:"+sum);
		 
	}
	public static void main(String []args) {
		Add obj=new Add();
		obj.add();
	}

}
