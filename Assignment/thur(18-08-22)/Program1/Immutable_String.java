/*write a java program to prove that string is immutable .*/
package Aug_18;

import java.util.Scanner;

public class Immutable_String {
	static Scanner sc= new Scanner(System.in);
	  String str,str1;// globally declared the string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immutable_String obj=new Immutable_String();// Creating object for the class
		obj.display();// calling display method
	}
	//creating display class
	public void display() {
		str="monika";// string 1
		str1="monika";// string 2
		// display the output before modification in string
		    System.out.println("Before modification two string are:\n"+ str+",  "+str1);
		    stringimmutableCheck(str,str1); // display after check check the condition
		    // display after modification in string
		    str = str.concat("\tsenger"); // add the words in the string 1
		    System.out.println("\nAfter modification two string are:\n" +str+",\t"+str1);
		    stringimmutableCheck(str,str1);// display after check check the condition and after modification
		}
	//creating string immutable Check with two parameters objects class
		public static void stringimmutableCheck(String str, String str1)
		{
			//check the condition of two object 
		    if(str==str1)
		    {// display the condition before modification in string
		        System.out.println("\nBoth string points to same reference");
		    }
		    else
		    { // display the condition  after modification in string
		        System.out.println("\nBoth string point to different object");
		    }
		}
}
