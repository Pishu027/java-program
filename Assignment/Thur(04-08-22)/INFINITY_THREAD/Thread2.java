// Step 2:

package lab04_08;

public class Thread2  extends Thread
{
    String msg1 = "";
    Thread2(String ms1g)
    {
         this.msg1 = msg1;
    }
    public void run()
    {
    	//infinity loop
              while (true)
              {
                   System.out.println(msg1);
              }
    }
    
   
}
