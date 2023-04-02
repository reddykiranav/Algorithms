/**
 * 
 */
package sortingnsearching;

/**
 * @author reddy
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = Util.readArray();
		mergeSort(a);
		Util.printArray(a);
	}

	private static void mergeSort(int[] a) {
		// TODO Auto-generated method stub
		int len = a.length;
		if(len>1){
			int mid = len/2;
			int left[] = new int[mid];
			int right[] = new int[len - mid];
			Util.copyArray(a,left,0,mid);
			Util.copyArray(a,right,mid,len);
			mergeSort(left);
			mergeSort(right);
			merge(a,left,right);
		}
	}

	private static void merge(int[] a, int[] left, int[] right) {
		// TODO Auto-generated method stub
		int leftLen = left.length;
		int rightLen = right.length;
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < leftLen && j < rightLen){
			if(left[i] < right[j]){
				a[k] = left[i];
				i++;
			}else{
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while(i < leftLen){
			a[k] = left[i];
			i++;
			k++;
		}
		
		while(j < rightLen){
			a[k] = right[j];
			j++;
			k++;
		}
	}
}