package MultithreadingLabQ;

public class DisplayFibRev 
{
	public static void main(String[]args)
	{
		try
		{
			//calling the object of Fibonnaci
			Fibonacci Thread1=new Fibonacci();
			
			//calling run method of the fib class
			Thread1.start();
			
			Thread.sleep(2000);//stop execution of the thread for 2000 msec
			
			//callinh the object of Reverse class
			Reverse Thread2=new Reverse();
			
			//calling run method of the rev class
			Thread2.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
