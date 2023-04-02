/**
 * 
 */
package recursion;

import java.util.Scanner;


/**
 * @author reddy
 *
 */
public class BinarySearch {

	private static Scanner scanner;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		int result = BinarySearch.binarySearch(a, target,0,len-1);
		if(result == -1){
			System.out.printf("Given Search key %d is not found",target);
		}else{
			System.out.printf("Given Search key is found at index %d",result);
		}

	}

	private static int binarySearch(int[] a, int target,int low,int high) {
		int mid = (low + high)/2;
		if(low <= high){
			if(a[mid] == target){
				return mid;
			}else if(target < a[mid]){
				 return binarySearch(a, target, low, mid-1);
			}else{
				return binarySearch(a, target, mid+1, high);
			}
		}
		return -1;
	}
}