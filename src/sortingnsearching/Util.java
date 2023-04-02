/**
 * 
 */
package sortingnsearching;

import java.util.Scanner;

/**
 * @author reddy
 *
 */
public final class Util {
	private static Scanner scanner;

	protected static void swap(int[] a, int i, int minIndex) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[minIndex];
		a[minIndex] = temp;
	}

	protected static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int[] readArray() {
		scanner = new Scanner(System.in);
		System.out.println("Please enter array size:");
		int arraySize = scanner.nextInt(); 
		int [] deck = new int[arraySize];
		System.out.println("Please enter values:");
		for (int i = 0; i < deck.length; i++) {
			deck[i] = scanner.nextInt();
		}
		return deck;
	}

	public static void copyArray(int[] arr, int[] subArr, int i, int mid) {
		// TODO Auto-generated method stub
		int k = 0;
		for (int j = i; j < mid; j++) {
			subArr[k] = arr[j];
			k++;
		}
	}
}

