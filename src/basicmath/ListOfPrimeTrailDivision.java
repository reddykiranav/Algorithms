/**
 * 
 */
package basicmath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class ListOfPrimeTrailDivision {

	/**
	 * @param args
	 */
	
	//TIME COMPLEXITY - O(N.SQRT(N))
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number till which prime is needed");
		int primeLimit = scanner.nextInt();
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= primeLimit; i++) {
			if(isPrime(i)){
			 primes.add(i);
			}
		}
		System.out.println("Primes till " + primeLimit + " are : " + primes);
	}

	private static boolean isPrime(int prime) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		for (int i = 2; i <=Math.sqrt(prime); i++) {
			if(prime%i == 0){
				isPrime = false;
			}
		}
		return isPrime;
	}

}
