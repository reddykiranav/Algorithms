/**
 * 
 */
package sortingnsearching;

/**
 * @author reddy
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,7,4,1,5,3};
		bubbleSort(a);
		Util.printArray(a);
	}

	private static void bubbleSort(int[] a) {
		int len =a.length;
		for (int i = 0; i < len-1; i++) {
			boolean sorted = true;
			for (int j = 0; j < len-i-1; j++) {
				if(a[j]>a[j+1]){
				Util.swap(a, j, j+1);
				 sorted= false;
				}
			}
			if(sorted){
				break;
			}
		}
	}
}