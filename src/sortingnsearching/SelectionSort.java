/**
 * 
 */
package sortingnsearching;

/**
 * @author reddy
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6};
		//int a[] = {4,2,3,4};
		selectionSort(a);
		System.out.println("Sorted List ");
		Util.printArray(a);
	}

	private static void selectionSort(int[] a) {
		// TODO Auto-generated method stub
		int len = a.length;
		for (int i = 0; i < len-1; i++) {
			int minIndex = i;
			int min = a[minIndex];
			for (int j = i+1; j < len; j++) {
				if(a[j] < min){
					min = a[j];
					minIndex = j;
				}
			}
			Util.swap(a,i,minIndex);
		}
	}
}