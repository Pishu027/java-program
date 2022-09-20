/*Write a program to check if two strings are created with same character
*Write a program to accept two strings from the use and check if first contains second
*Write a program to swap two strings without using third variable
**/
package Aug_18;

import java.util.Scanner;

public class program2 {
	Scanner sc= new Scanner(System.in);
	static String str1;
	static String str2;
	char chs1,chs2;// globally declared the variables
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program2  obj=new program2 (); // creating the object of  class
		obj.check_character();// calling check character method
		obj.check_strings();// calling check  one string contain second string method
		obj.swap_string();// calling swap the two string method
	}
	
// create the accept class
	public void accept() {
		System.out.println("First String: "); // printing first string
		 str1=sc.next().toLowerCase(); // accept first string from user
			System.out.println("Second String: "); // printing second string
			 str2=sc.next().toLowerCase(); // accept second string from user
	}
	//creating class to check the strings  start with same character
	public void check_character() {
		System.out.println("\n\t\t.....THIS CHECK THE STRINGS START WITH SAME CHARACTER.....");
		accept();// display the accept method
		 System.out.println("Enter the character from which both string start :");
			String ch=sc.next().toLowerCase();// accept the character from user to check
	boolean result=str1.startsWith(ch)==str2.startsWith(ch);// check the condition and put the result in boolean form
	// display the statement according to the value of result of string
	if(result) {
		System.out.println(result+","+"\tBoth strings start with same character");
		}else {
			System.out.println(result+","+"\tBoth strings are not start with same character");
		}
	}
	//creating class to check the one string contain second string
public void check_strings() {
	System.out.println("\n\n\t\t.....THIS CHECK ONE STRING CONTAIN ANOTHER STRING.....");
	accept();
//check the condition for strings
	boolean result = str1.contains(str2);
    if(result) {// condition is true print this statement
      System.out.println(result+", "+"("+str2 + ") word of second string is present in first string:\t"+ str1);
    }
    else {// condition is false print this statement
      System.out.println(result+", "+"("+str2 + ") word of second string is not present in first string:\t"+str1);
    }
  }
//creating class to swap the two string with out third string
public void swap_string(){
	System.out.println("\n\n\t\t.....THIS SWAP THE TWO STRING WITHOUT USE OF THIRD STRING.....");
	accept();// display the accept method
	// display the strings before swapping
	System.out.println("Before swapping numbers:\n first string\t:"+str1 +"\n second string:\t"+ str2);  
	str1=str1+str2; // add both the string in string1
   str2=str1.substring(0,str1.length()-str2.length()); // put the string 1 value in string 2
 str1=str1.substring(str2.length()); // the value of string 2 put in string1
 // display the strings after swapping
    System.out.println("\nAfter swapping without third string use:\n first string\t: "+str1+"\n second string:\t" + str2);  
}

}
