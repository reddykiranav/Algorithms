/**
 * 
 */
package iterative;

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
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number for which you have to find factorial:");
		int n = scanner.nextInt();
		System.out.println("Factorial of " + n + " is :" + factorial(n));
	}

	private static int factorial(int n) {
		int fact = 1;
		
		if(n == 0){
			return fact;
		}
		for (int i = n; i >= 1; i--) {
			fact = fact*i;
		}
		return fact;
	}

}
