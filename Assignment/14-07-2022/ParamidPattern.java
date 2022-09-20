package demo;

import java.util.Scanner;

public class ParamidPattern {
	public void pattern() {
		int rows;
		Scanner sc=new Scanner(System.in);
		
		//taking input from user
		System.out.println("Enter the row from user");
		rows=sc.nextInt();
		
		int rowCount=1;
		System.out.println("Payramid pattern");
		
		//perform printing paramid pattern operation
		for(int i=rows;i>0;i--) {
			//print space
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=rowCount;j++) {
				System.out.print(rowCount+" ");
			}
			System.out.println();
			
			rowCount++;
		}	
		
	}
	public static void main(String[]args) {
		ParamidPattern obj=new ParamidPattern();
		obj.pattern();
	}

}
