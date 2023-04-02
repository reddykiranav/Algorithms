/**
 * 
 */
package basicmath;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class PrimeFactorization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please Enter the number for which you need prime factors:");
		int n = scanner.nextInt();
		System.out.println("Prime Factors are:");
		for (int i = 2; i <= Math.sqrt(n); i++) {
		//	System.out.println(" Quotient : " + n%i);
			if(n%i == 0){
				int count = 0;
				while (n%i == 0) {
					n = n/i;
					count++;
				}
				System.out.println( count + "  time(s)  " + i);
			}
		//	System.out.println(i +" th iteration and n value "+ n);
		}
		if(n!=1){
			System.out.println(1 + "  time     " + n);
		}
	}
}