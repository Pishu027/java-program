package demo;
import java.util.Scanner;

public class valid_age {
	public static void main(String[]args)
	{
		valid_age obj=new valid_age();
		obj.Check();
	}
	Scanner sc=new Scanner(System.in);
	int age;
	//handle exceptions
	public void Check()
	{
		try
		{
			//taking input from user
			System.out.println("Enter your age");
			age=sc.nextInt();
			check_age();
		}
		//handle arithmetic exception
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}
	//check age is valid or not 
	public void check_age()
	{
		if(age < 18)
		{
			//if invalid age then print the msg and throw exception
			throw new ArithmeticException("Invalid age......!\n"+"You are noy eligible For vot age should be greater than 18");
		}
		else
		{
			//in case valid age printt msg age is valid
			System.out.println("Valid age....!\n"+"you are eligible for vote");
		}
	}

}
