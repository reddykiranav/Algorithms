/**
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number for which you have to find factorial:");
		int n = scanner.nextInt();
		System.out.println("Factorial of " + n + " is :"+factorial(n));
		
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if(n ==  0){
			return 1; 
		}
		return n * factorial(n-1);
	}
}