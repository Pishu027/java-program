/* Write a program to reverse each word of the string
 *  Write a program to accept string from user and find all permutations of the string
 * Write a program to accept string from the user and check it is palindrome or not without using function of string builder and string buffer
*/
package Aug_18;

import java.util.Scanner;

public class Program3 {
	static Scanner sc= new Scanner(System.in);
	static String str1;// globally declared the variables
	String str2;
	static int len;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 obj=new Program3();// creating the object of  class
		obj.reverse_string(str1);// calling reverse string method
		obj.display();// calling display  permutation of string method
		obj.pallidome_string();// calling check the pallidrome the string method
	}
	//create the class for reverse each word in string
	public void reverse_string(String str1) {
		System.out.println("\n\t\t.....THIS REVERSE THE EACH WORD IN THE STRING.....");
		System.out.println("Enter the  String: "); // printing  string
		 str1=sc.next(); // accept  string from user
		String[] words = str1.split(" ");
		String reversedString = "";
		//loop for check the string length
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			// The charAt() function returns the character at the given position in a string 
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}// display the the reverse word of string
		System.out.println("string befor reverse:\n"+str1);
		System.out.println("after reverse the words:\n"+reversedString);
	}
	
	  // create the class for swap  the string to make the permutation of string
	 public static String swapString(String a, int i, int j) {    
	     // swap the string with other integer value   
		 char[] b =a.toCharArray();    
	        char ch;    
	        ch = b[i];    
	        b[i] = b[j];    
	        b[j] = ch;    
	        return String.valueOf(b);    
	    }    
	  // create the class to display the string output of permutation of string
	    public static void display(){  
	    	System.out.println("\n\t\t.....THIS FIND THE PERMUTATION OF STRING.....");
	    	System.out.println("enter the  String: "); // printing first string
			 str1=sc.next(); // accept first string from user   
	        int len = str1.length();    
	        System.out.println("All the permutations of the string are: ");    
	        generatePermutation(str1, 0, len);    
	    }    
	        
	    //Function for generating different permutations of the string    
	    public static void generatePermutation(String str, int start, int end)    
	    {     //Prints the permutations    
	        if (start == end-1)    
	            System.out.println(str);    
	        else    
	        {   for (int i = start; i < end; i++)    
	            {   //Swapping the string by fixing a character    
	                str = swapString(str,start,i);    
	                //Recursively calling function generatePermutation() for rest of the characters     
	                generatePermutation(str,start+1,end);    
	                //Backtracking and swapping the characters again.    
	                str = swapString(str,start,i);    
	            }     }     }   
	    
	    
	    // create the class to check the pallidrome the string
public void pallidome_string() {
	System.out.println("\n\t\t.....THIS CHECK THE PALLIDROME OF THE STRING....");
	System.out.println("Enter the  String: "); // printing first string
	 str1=sc.next(); // accept first string from user  
	String rev = (new StringBuilder(str1)).reverse().toString();
    //check if string is palindrome or not
    if(str1.equals(rev)) {
        System.out.println(str1+" is Palindrome.");
    } else {
        System.out.println(str1+" is not Palindrome.");
    }
}


}
