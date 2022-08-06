

package lab04_08;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\t\t\t\t\t\t\t\t\tFibonacci Series");
		//creating object and running Thread from ThreadFibonacciSeries class
		Fibonaci obj1 = new Fibonaci(10);
		obj1.start();
		
		System.out.println("\t\t\t\t\t\t\t\t\tRiverse Order ");
		//creating object and running Thread from ThreadRiverseOrder
		Riverse obj2 = new Riverse(124);
		obj2.start();
	}
	

}
