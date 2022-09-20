package demo;

import java.util.Scanner;

public class Account_Balance extends ATM
{
	Scanner sc=new Scanner(System.in);
	int deposite_amount;
	int withdrew_amount;
	int p;
	
	public void fill_detail()
	{
		do 
		{
		    //taking input from user
			
		    //taking account number
		    System.out.println("Enter Account number:");
		    account_no=sc.nextInt();
		    
		    //taking account holder name
		    System.out.println("Enter Account holder name:");
		    name=sc.next();
		    
		    System.out.println("Select your Account type:\n 1.CUURENT ACOOUNT \n 2.SAVING ACCOUNT");
		    acc_type=sc.nextInt();
		    
		    //user select our account type
		    switch(acc_type) 
		    {
		
		    case 1:
			     System.out.println("CURRENT ACCOUNT");
			     break;
		    case 2:
			     System.out.println("SAVING ACCOUNT");
                             break;
			
		    default:
			     System.out.println("Invalid type:");
			     break;
		     }
		    
		    //taking phone number
		    System.out.println("Enter youre Phone number:");
		    phone_no=sc.nextInt();
		    
		    //show account balance
		    System.out.println("Account bnalance:"+getBalance());
		    
		    show_account();
		    
		    //taking four digit pin from user
		    System.out.println("");
		    System.out.println("Enter your 4 digit pin:");
		    p=sc.nextInt();
		    if(getPin() == p)
		    {
			   depo_withd();
		    }
		    else
		    {
			   System.out.println("please...! Enter valid pin:");
		    }
		
		    System.out.println("Do you want to continue..!(Y/N) ? ");
		    cout=sc.next().charAt(0);
		}
		while(cout == 'y'|| cout == 'Y');
		
	}
	
	public void show_account()
	{
		//print all statements
		System.out.println("");
		System.out.println("Your details is:");
		System.out.println("Account Number:"+account_no);
		System.out.println("Name:"+name);
		System.out.println("Account type:"+acc_type);
		System.out.println("Phone no:"+phone_no);
		System.out.println("Balance:"+getBalance());
	}

	public void depo_withd() 
	{
		System.out.println("");
		System.out.println("Enter youre choice\n1.deposite\n2.withdrew\n3.Check balance\n4.Exit");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			//if user want to deposit some amount
			System.out.println("Enter your deposite amount:");
			deposite_amount=sc.nextInt();
			System.out.println("Account balance after deposite:"+(getBalance() + deposite_amount));
			break;
			
		 case 2:
			 //if user want to withdrew some amount
			 System.out.println("Enter amount you want to withdrew:");
			 withdrew_amount=sc.nextInt();
			 
			 if(getBalance() < withdrew_amount)
			 {
				 System.out.println("less amount.....! transaction failed..!");
			 }
			 else
			 {
			     System.out.println("Account balance after withdrew:"+(getBalance() - withdrew_amount));
			 }
			 break;
		 case 3:
			 //show user account balance
			 System.out.println("Youre Account balance is:"+getBalance());
			 break;
			
		 case 4:
		         //if user want to exit
			 System.exit(0);
			 break;
			     
	     default:
			 //if user will chose Invalid case
		         System.out.println("Invalid....!");
		         break;
		     
		}
	}	
	public static void main(String[]args) 
	{
		Account_Balance obj=new Account_Balance();
		obj.fill_detail();
	}

}
