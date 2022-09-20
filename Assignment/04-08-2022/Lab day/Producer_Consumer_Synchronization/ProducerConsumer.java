package MultithreadingLabQ;

public class ProducerConsumer {
	public static void main(String[]args)
	{
		//creating object of the Shop class
		Shop s=new Shop();
		
		//calling constructor of the producer class
		Producer p=new Producer(s,1);
		
		//calling constructor of the consumer class
		Consumer c=new Consumer(s,1);
		
		//start both thread
		p.start();
		c.start();
		
	}

}
