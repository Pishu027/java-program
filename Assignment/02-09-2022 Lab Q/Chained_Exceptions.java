/*Write a program to create the chained exception where one exception describes the cause of another exception in java*/
package MultithreadingLabQ;

public class Chained_Exceptions {
	public void exeptions()
	{
		try 
		{
			// creating an exception
	        ArithmeticException e = new ArithmeticException("Apparent cause");
	        // set the cause of an exception
	        e.initCause(new NullPointerException("Actual cause"));
	        // throwing the exception
	        throw e;
	      }
		catch(ArithmeticException e) 
		{
	         // Getting the actual cause of the exception
	         System.out.println(e.getCause());
	     }
	}
	public void main(String[]args)
	{
		Chained_Exceptions obj=new Chained_Exceptions();
		obj.exeptions();
	}

}
