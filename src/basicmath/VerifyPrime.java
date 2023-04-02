/**
 * 
 */
package basicmath;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class VerifyPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the nmuber to be verified:");
		int prime = scanner.nextInt();
		if(prime == 1){
			System.err.println("1 is not a prime, Please enter number greater than 1 {one})");
			return;
		}
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(prime); i++) {
			if(prime%i == 0){
				isPrime = false;
			}
		}
		if(isPrime){
			System.out.println("Given number is a prime");
		}else{
			System.out.println("Given number is not a prime");	
		}
	}
}