/**
 * 
 */
package iterative;

/**
 * @author reddy
 *
 */
public class NumberOfRotationsInSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//int a[] = {12,2,3,5,8,11};
		int a[] = {8,11,12,2,3,5};
		int count = findNumOfRot(a,a.length);
		System.out.printf("The array is rotated %d times",count);
	}

	private static int findNumOfRot(int[] a, int length) {
		int low = 0;
		int high = length-1;
		while (low <= high) {
			if(a[low] <= a[high]){
				return low;
			}
			int mid = low+(high-low)/2;
			int next = (mid+1)%length;
			int prev = (mid+length-1)%length;
			if(a[next] >= a[mid] && a[prev] >= a[mid]){
				return mid;
			}else if(a[mid] <= a[high]){
				high = mid - 1;
			}else if (a[mid]>=a[low]){
				low = mid+1;
			}
		}
		return 0;
	}
}