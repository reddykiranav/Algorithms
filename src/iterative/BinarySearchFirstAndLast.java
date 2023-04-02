/**
 * 
 */
package iterative;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class BinarySearchFirstAndLast {


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
		int result = BinarySearchFirstAndLast.binarySearch(a, target, true);
		if(result == -1){
			System.out.printf("Given Search key %d is not found",target);
		}else{
			System.out.printf("Given Search key is found at index %d",result);
		}
	}

	static int binarySearch(int a[],int target, boolean searchFirst){
		int low = 0;
		int high = a.length - 1;
		int result = -1;
		while(low<=high){
			int mid = low+(high-low)/2;
			if(a[mid] == target){
				result = mid;
				if(searchFirst){
					high = mid -1; 	
				}
				else{
					low = mid + 1;
				}
			}else if(target < a[mid]){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}
		return result;
	}
}