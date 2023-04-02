/**
 * 
 */
package iterative;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class BinarySearchCountOccurence1 {

	private static Scanner scanner;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Array size:");
		int len = scanner.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the array elements:");
		for (int i = 0; i < len; i++) {
			a[i] = scanner.nextInt(); 
		}
		System.out.println("Enter search key:");
		int target = scanner.nextInt();
		int firstIndex = BinarySearchFirstAndLast.binarySearch(a, target, true);
		if(firstIndex == -1){
			System.out.printf("%d is not found in the given array:",target);
		}else{
			int lastIndex = BinarySearchFirstAndLast.binarySearch(a, target, false);
			System.out.printf("Count is %d",(lastIndex - firstIndex)+1);
		}
	}

}
