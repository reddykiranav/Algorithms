/**
 * 
 */
package recursion;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class RecursiveExponentiation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number :");
		int n = scanner.nextInt();
		System.out.println("Please enter the exponent:");
		int m = scanner.nextInt();
		System.out.println("n to the power m is:");
		
		int result = 1;
		for (int i = 1; i <=m; i++) {
			result = result * n;
		}
		System.out.println(result);
		System.out.println(Math.pow(0, 0));
	}

}
