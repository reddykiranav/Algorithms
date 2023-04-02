/**
 * 
 */
package saturdaychallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ReddyKiran_Av
 *
 */
public class TargetSumBy2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {-2,4,5,8,9,12,2};
		int num = 10; // 21, 0 f
		Arrays.sort(arr); 																						    //  N.LOG(N)
		for (int i = 0; i < arr.length; i++) {																	    //  N
			System.out.print(arr[i] + "  " );
		}
		System.out.println();
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {  																	 // N
			if(Arrays.binarySearch(arr, num - arr[i])>=0 && arr[i] != (num - arr[i]) && !integers.contains(arr[i])){ // LOG(N)
				integers.add(arr[i]);
				integers.add(num-arr[i]);
			}
		}
		System.out.println("The target pair(s):"+integers);
	}
}