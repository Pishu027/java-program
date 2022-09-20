package demo;
import java.util.Scanner;

public class Multi2 extends Multilevel
{
	
	//method for find palindrome or not
	public void paln() 
	{
		Scanner sc=new Scanner(System.in);
		
		//taking number from user
		System.out.println("Enter the number n");
		int n=sc.nextInt();
		int sum = 0;

        int temp;
        for(temp = n; n > 0; n /= 10) {
            int r = n % 10;
            sum = sum * 10 + r;
        }

        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }      
	}
	public static void main(String[]args)
	{
		Multi2 obj=new Multi2();
		obj.fibonacci();
	}
	
}
