package demo;

public class Use_data_operations extends User_data {
	public static final int PASSWORD_LENGTH = 8;
	String u_id;
	String password;
	int i;
	int c=0;
			
	//accept input from user
	public void accept()
	{
		System.out.println("Enter Your Name:");
		name=sc.next();
				
		System.out.println("Enter your Phone Number:");
		phon_no=sc.nextInt();
				
		System.out.println("Enter youre Address:");
		address=sc.next();
		check_password();		
		id();
		show();
				
	 }
	 //handle user  id exception
	 public void id()
	 {
		 try
		 {
			 System.out.println(" ");
			 System.out.println("Enter your user ID\n"+"1.It must have 8 digit");
			 u_id=sc.next();
			 setUser_id(u_id);
			 if(u_id.length() < 8)
			 {
				 //throw in case exception is occur
				 throw new Exception("Please...! Enter a valid ID........!");
			  }
			 else
			 {
				 //in case exception is not occur then print the user id
				 System.out.println("your ID is:"+getUser_id());
				 }
			}
		catch(Exception e)
		 {
			System.out.println("The User ID contain must be maximum 8 lenghth.");
			}
				
		 }
			
	 //handle password exception
    public void check_password()
    {
    	System.out.println("Enter a Password");
    	//password rule 
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.):\n");
        System.out.println(" ");//for space
        password= sc.next();

        try 
        {
        	
        //check conditions that password is valid or not	
        if (is_Valid_Password(password))
        {
        	//in case password is valid print password
            System.out.println("Password is valid: " + password);
            setPwt(password);
            System.out.println("password is:"+getPwt());
            
        }
        else 
        {
        	//in case password is not valid then throw exception
            throw new Exception("Not a valid password: " +password);
        }
        }
        //handel the exceptions of the try block
        catch(Exception e)
        {
        	System.out.println("Invalid password......please Enter a valid password");
        }

    }

    //check password is valid or not
    public  boolean is_Valid_Password(String password) {

        if (password.length() < PASSWORD_LENGTH) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++)
        {

            char ch = password.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }


        return (charCount >= 2 && numCount >= 2);
    }

    //password consist letters a to z
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    //passworsd consist number 0 to 9
    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
	        
	public void show() 
	{
		//print all inputs
		System.out.println(" ");
		System.out.println("Nmae:"+name);
	    System.out.println("Phone number:"+phon_no);
	    System.out.println("Address:"+address);
		System.out.println("User ID:"+getUser_id());
		System.out.println("Password:"+getPwt());
	}
		
}

