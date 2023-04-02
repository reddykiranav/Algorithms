/**
 * 
 */
package sortingnsearching;

/**
 * @author reddy
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = Util.readArray();
		int start = 0;
		int end = a.length-1;
		quickSort(a, start,end);
		Util.printArray(a);
	}

	private static void quickSort(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int [] b = new int[end];
		if(start < end){
			int pivotIndex = Partition(a,start,end);
			quickSort(a, start, pivotIndex-1);
			quickSort(a, pivotIndex+1, end);
		}
	}

	private static int Partition(int[] a, int start, int end) {
			int pivot = a[end];
			//int b [] = new int[end];
			int pivotIndex = start;
			for (int i = start; i <= end-1; i++) {
				if(a[i] <=pivot){
					Util.swap(a, i, pivotIndex);
					pivotIndex++;
				}
			}
			Util.swap(a, pivotIndex, end);
			return pivotIndex;
	}
}