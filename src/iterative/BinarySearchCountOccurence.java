/**
 * 
 */
package iterative;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class BinarySearchCountOccurence {


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
		int result = BinarySearchCountOccurence.binarySearch(a, target);
		System.out.println("Count :" + result);
	}

	static int binarySearch(int a[],int target){
		int low = 0;
		int high = a.length - 1;
		int result = 0;
		while(low<=high){
			int mid = low+(high-low)/2;
			if(a[mid] == target){
				result++;
				result = countLowerAdjacents(a,mid,target,result);
				result = countHigherAdjacents(a,mid,target,result);
				break;
			}else if(target < a[mid]){
				high = mid-1;
			}else{
				low = mid+1;
			}
		}
		return result;
	}

	private static int countHigherAdjacents(int[] a, int mid, int target, int result) {
		if(mid + 1 < a.length && a[mid+1] == target){
			result++;
			result = countHigherAdjacents(a, mid+1, target, result);
		}
		return result;
	}

	private static int countLowerAdjacents(int[] a, int mid, int target, int result) {
		if(mid-1 >= 0 && a[mid - 1 ] == target){
			result++;
			result = countLowerAdjacents(a, mid-1, target, result);
		}
		return result;
	}
}