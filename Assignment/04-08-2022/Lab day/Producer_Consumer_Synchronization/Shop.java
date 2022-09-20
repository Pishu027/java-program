package MultithreadingLabQ;

public class Shop
{
	//create  variables
	int meterial;
	boolean availeble=false;
	
	//synchrinized set method
	public synchronized void put(int value)
	{
		//producer thread wait while list is full
		while(availeble == true)
		{
			//try catch block handle the exception
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			
		}
		availeble=true;
		meterial=value;
		notifyAll();
	}
	
	//synchronised get method
	public synchronized int get()
	{
		//customer thread wait while list is empty
		while(availeble == false)
		{
			//try catch block handle the exception
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		availeble=false;
		notifyAll();
		return meterial;
	}

}
