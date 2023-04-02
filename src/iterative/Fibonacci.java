/**
 * 
 */
package iterative;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number for which you have to find fibonacci:");
		int n = scanner.nextInt();
		System.out.println("fibonacci of " + n + " is :"+fibonacci(n));
	}

	private static int fibonacci(int n) {
		int fib = n;
		if(n<=1){
			return fib;
		}
		int f1 = 0;
		int f2 = 1;
		//f = f1+f2;
		for (int i = 2; i <=n; i++) {
			fib = f1 + f2;;
			f1 = f2;
			f2 = fib;
		}
		return fib;
	}

}
