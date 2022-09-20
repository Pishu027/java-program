package demo;

public class ATM
{
	int account_no;
	String name;
	char cout;
	int phone_no;
	int acc_type,choice;
	private long balance=50000;
	private int password;
	private int pin=5647;
	
	//get pin
	public int getPin() 
	{
		return pin;
	}
    
	//set pin
	public void setPin(int pin) 
	{
		this.pin = pin;
	}

    //get password
	public int getPassword() 
	{
		return password;
	}
    
	//set password
	public void setPassword(int password) 
	{
		this.password = password;
	}
	
	//get balance
	public long getBalance() 
	{
		return balance;
	}
    
	//set balance
	public void setBalance(long balance)
	{
		this.balance = balance;
	}

	
}
