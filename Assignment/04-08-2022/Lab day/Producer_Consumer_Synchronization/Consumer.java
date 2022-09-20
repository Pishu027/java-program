package MultithreadingLabQ;

public class Consumer extends Thread
{
	//creat variables
	Shop shop ;
	int number;
	
	//create constructor of the class
	public Consumer(Shop c,int number)
	{
		//assign values
		shop=c;
		this.number=number;
	}
	
	//run method of the thread class
	public void run()
	{
		int value=0;
		
		//consumer got the value from the buffer
		for(int i=0;i<10;i++)
		{
			value=shop.get();
			System.out.println("Consume value:"+this.number+"got:"+value);
												
		}
	}
	
}
