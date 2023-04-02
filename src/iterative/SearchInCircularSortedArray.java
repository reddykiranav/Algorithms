/**
 * 
 */
package iterative;

/**
 * @author reddy
 *
 */
public class SearchInCircularSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {2,2,2,2,2,0,2,2};
		int x = 0;
		int index = searchInCirculerSortedArray(a,x,a.length);
		System.out.println("Given number found at index : "+index);
	}

	private static int searchInCirculerSortedArray(int[] a, int x, int length) {
		
		int low = 0;
		int high = length -1 ;
		while(low <= high){
			int mid = (low + high)/2;
			if(a[mid] == x){
				return mid;
			}
			if(a[mid] <= a[high]){ // right half is sorted
				if(x > a[mid] && x <= a[high]){
					low = mid+1;
				}else{
					high = mid -1;
				}
			}else{
				if(x >= a[low] && x < a[mid]){
					high = mid -1;
				}else{
					low = mid + 1;
				}
			}
		}
		return -1;
	}
}