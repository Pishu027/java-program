package MultithreadingLabQ;

public class Fibonacci extends Thread 
{
	//run method of thread
	public void run()
	{
		//use try block for write exception code
		try
		{
			//taking input
			int a,b,c,count,i;
			a=0;
			b=1;
			count=10;
			
			System.out.println("Fibonacci series:");
			
			//print fib series
			for(i=2;i<count;++i)
			{
				c=a+b;
				System.out.println(""+c);
				a=b;
				b=c;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
}
