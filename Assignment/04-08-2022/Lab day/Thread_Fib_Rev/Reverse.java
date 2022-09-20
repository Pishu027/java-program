package MultithreadingLabQ;

public class Reverse extends Thread
{
	//run method of the thread
	public void run()
	{
		try
		{
			
			System.out.println("printing the reverse numbers");
			System.out.println("");
			
			//print reverse numbers
			for(int i=10;i>=1;--i)
			{
				System.out.println(""+i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
