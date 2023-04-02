/**
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class FibonacciWithMemoization {

	/**
	 * @param args
	 */
	static int[] memory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number for which you have to find fibonacci:");
		int n = scanner.nextInt();
		intialiseAndPopulateMemory(n);
		System.out.println(fibonacci(n));
	}

	private static void intialiseAndPopulateMemory(int n) {
		memory = new int[n+1];
		for (int i = 0; i < memory.length; i++) {
			memory[i] = -1;
		}
		memory[0] = 0;
		memory[1] = 1;
	}

	static int fibonacci(int n) {
		if (memory[n] != -1) {
			return memory[n];
		}
		memory[n] = fibonacci(n - 1) + fibonacci(n - 2);
		return memory[n];
	}
}