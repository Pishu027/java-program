// Q1) Write a program that creates 2 threads - each displaying a message 
//     (Pass the message as a parameter to the constructor). The threads 
//     should display the messages continuously till the user presses any key.

// Step 1:

package lab04_08;

import java.util.Scanner;

public class Thread1  extends Thread
{
    String msg = "";
    Thread1(String msg)
    {
         this.msg = msg;
    }
    public void run()
    {        //infinity loop
              while (true)
              {
                   System.out.println(msg);
              }
    }
    
   
}
