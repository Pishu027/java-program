package demo;
import java.util.Scanner;
public class Login_Password_details
{
		String id,s; 
		private  String password,user_Id;
		
		static int pass_length=9;
		Scanner sc= new Scanner(System.in);
		 
		//class for accepting the id from user
		public void accept() {
		
		System.out.println("Enter your user id :");
		user_Id=sc.next();
		password();
			
	}
		
        // class for password
		public void password()
		{
			System.out.print("Password should not contain any space.\n"
						     + "Password should contain at least one digit(0-9).\n"
						     + "Password length should be between 0 to 9 characters.\n"
						     + "Password should contain at least one lowercase letter(a-z).\n"
						     + "Password should contain at least one uppercase letter(A-Z).\n"
						     + "Password should contain at least one special character ( @, #, %, &, !, $, etc�.)."); 
		    s = sc.next();
		               
			try
			{ 
				// try catch for password
				if (is_Valid_Password(s))
				{
					System.out.println("Password is valid: " + s);
				     show();
				} 
				else 
				{
					throw new Exception("Not a valid password: ");
				}
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
				
		}
			
		//get and set methods for get and set value
		public String getPassword()
		{
			return password;
		}
		public void setPassword(String password)
		{
			this.password = password;
		}

		public String getUser_Id() 
		{
			return user_Id;
		}
		public void setUser_Id(String user_Id)
		{
			this.user_Id = user_Id;
		}

		// class for checking the condition for space
		public static boolean space(String password) 
		{
			if (password.contains(" "))
			{
				// condition for space
	            return true;
			}
			return false;
		}
		// class for checking the condition for password length
		public static boolean is_Valid_Password(String password) 
		{
			if (password.length() < pass_length) return false;// condition for length of password
			int charCount = 0;
			int numCount = 0;
			for (int i = 0; i < password.length(); i++)
			{
				char ch = password.charAt(i);
			    if (is_Numeric(ch)) 
			    { 
			    	numCount++;// condition for number of password contain digit
			    }
			    else if (up_Letter(ch)) 
			    {
			    	charCount++;// condition for character are in upper case
			    }
			    else if (lo_Letter(ch)) 
			    {
			    	charCount++;// condition for character are in lower case
			    }
			    else if((password.contains("@") || password.contains("#") // condition for special char
			    		|| password.contains("!") || password.contains("~")
				        || password.contains("$") || password.contains("%")
				        || password.contains("^") || password.contains("&")
				        || password.contains("*") || password.contains("(")
				        || password.contains(")") || password.contains("-")
				        || password.contains("+") || password.contains("/")
				        || password.contains(":") || password.contains(".")
				        || password.contains(", ") || password.contains("<")
				        || password.contains(">") || password.contains("?")
				        || password.contains("|")));
			            else return false; // character if nothing is true
			        }
			        return (charCount >= 2 && numCount >= 2);
			    }
		// class for checking the condition for password letter in capital letter
	    public static boolean up_Letter(char ch)
	    {
	    	ch = Character.toUpperCase(ch);
			return (ch >= 'A' && ch <= 'Z');
		}
	    // class for checking the condition for password letter in small letter
	    public static boolean lo_Letter(char ch) 
	    {
	    	ch = Character.toLowerCase(ch);
			return (ch >= 'a' && ch <= 'z');
	     }

	    // class for checking the condition for password number
	    public static boolean is_Numeric(char ch)
	    {
	    	return (ch >= '0' && ch <= '9');
	     }
			    		    
		 //display details 
		 public void show()
		 {
			 System.out.println("Your Id : "+getUser_Id());
			 System.out.println("Your Password : "+getPassword());
		  }

}
