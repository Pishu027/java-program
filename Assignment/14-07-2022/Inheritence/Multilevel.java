package demo;
import java.util.Scanner;

public class Multilevel 
{
	 public void fibonacci()
	 {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the number");
		    int n=sc.nextInt();
		    
	        int a=0;//initializing value
	        int b=1;
	        int c;
	        System.out.println(a+" "+b);

	        //printing series
	        for (int i=1;i<=n;i++){
	            c=a+b;
	            System.out.println(c);
	            a=b;
	            b=c;
	        }
	    }

}
