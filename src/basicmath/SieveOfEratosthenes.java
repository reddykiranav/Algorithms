/**
 * 
 */
package basicmath;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class SieveOfEratosthenes {

	/**
	 * @param args
	 */
	// TIME COMPLEXITY - O(N.LOG(N).LOG(N))
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number till which you need to know primes:");
		int n = scanner.nextInt();
		int primes[] = new int[n+1];
		for (int i = 0; i <= n; i++) {
			primes[i] = 1;
		}
		primes[0] = 0;
		primes[1] = 0;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if(primes[i] == 1){
				for (int j = 2; i*j <= n; j++) {
					primes[i*j] = 0;
				}
			}
		}
		System.out.println("Below are the prime numbers:");
		for (int i = 0; i < primes.length; i++) {
			if(primes[i] == 1){
				System.out.println(i);
			}	
		}
	}
}