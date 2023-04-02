/**
 * 
 */
package recursion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number for which you have to find fibonacci:");
		int n = scanner.nextInt();
		List<Integer> integers = new ArrayList<>();
		System.out.println("fibonacci of " + n + " is :"+fibonacci(n,integers));
		integers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
			
		});
		System.out.println(integers);
		System.out.println("Please enter the number for which you have to find no of repetitions: ");
		int m = scanner.nextInt();
		System.out.println("The number of times F("+m+") calculated is:"+integers.subList(integers.lastIndexOf(m-1), integers.lastIndexOf(m)).size());
	}

	private static int fibonacci(int n, List<Integer> integers) {
		//integers.add(n);
		if(n == 0 || n == 1){
			return n;
		}
		
		return fibonacci(n-1,integers) + fibonacci(n-2,integers);
	}
}