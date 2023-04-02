/**
 * 
 */
package basicmath;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class EuclidsAlgo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("GCD is :"+euclidsGCD(scanner.nextInt(),scanner.nextInt()));
	}

	private static int euclidsGCD(int nextInt, int nextInt2) {
		// TODO Auto-generated method stub
		int dividend = nextInt;
		int divisor = nextInt2;
		int remainder = 0;
		while(divisor != 0){
			remainder = dividend%divisor;
			dividend = divisor;
			divisor = remainder;
		}
		return dividend;
	}
}