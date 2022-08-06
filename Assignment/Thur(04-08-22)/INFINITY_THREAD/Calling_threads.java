// Step 3:

package lab04_08;

public class Calling_threads {

	public static void main(String[] args)
	     {    //creating objects
	          Thread1 t1 = new Thread1("Running Thread1....");
	          Thread1 t2 = new Thread1("Running Thread2....");
	          
	          //calling run method using start method
	          t1.start();
	          t2.start();
	     }

	}

