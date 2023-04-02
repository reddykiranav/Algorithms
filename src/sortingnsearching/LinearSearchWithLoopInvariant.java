/**
 * 
 */
package sortingnsearching;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public class LinearSearchWithLoopInvariant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = scanner.nextInt();
		int [] a = new int[size];
		System.out.println("Enter the elements: ");
		for(int i =0; i<size;i++){
			a[i] =  scanner.nextInt(); 
		}
		System.out.println("Enter the key to be searched:");
		int key = scanner.nextInt();
		int i = 0;
		for (i = 0; i < a.length; i++) {
			if(key != a[i]){
				continue;
			}
			break;
		}
		System.out.println("Key Found at : " + (i+1));
	}
}