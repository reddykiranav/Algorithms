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
public class AllFactorsOfANumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number for which u have to find factors:");
		int n = scanner.nextInt();
		List<Integer> factors = new ArrayList<>();
		for (int i = 1; i <=Math.sqrt(n); i++) {
			if(n%i == 0){
				factors.add(i);
				if(!factors.contains(n/i)){
					factors.add(n/i);	
				}
			}
		}
		System.out.println("Factors:" +factors);
	}
}