package MultithreadingLabQ;

public class Producer extends Thread
{
	//create variables
	Shop shop ;
	int number;
	
	//create constructor of the class
	public Producer(Shop c,int number)
	{
		//assign the values
		shop=c;
		this.number=number;
	}
	
	//run method of the thread class
	public void run()
	{
		//producer put the value in buffer
		for(int i=0;i<10;i++)
		{
			shop.put(i);
			System.out.println("Produced value:"+this.number+"put:"+i);
			
			//try catch block handle the exception
			try
			{
				sleep(2000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			
		}
	}

}
