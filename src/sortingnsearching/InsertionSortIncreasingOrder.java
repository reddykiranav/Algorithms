package sortingnsearching;

import java.util.Scanner;

/*index 0 1 2
elements 7 8 9

itr1

i=1
key = 8
j = 0
7 7 9
j = -1
8 7 9

itr2

i=2
key = 9
j = 1
8 7 7
j = 0
8 8 7
j = -1
9 8 7 */

public class InsertionSortIncreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter array size:");
		int arraySize = scanner.nextInt(); 
		int [] deck = new int[arraySize];
		System.out.println("Please enter values:");
		for (int i = 0; i < deck.length; i++) {
			deck[i] = scanner.nextInt();
		}
		System.out.print("The intial deck is :");
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i] +" ");
		}
		for (int i = 1; i < deck.length; i++) {
			int key = deck[i];
			int j = i - 1;
			while(j >= 0 && deck[j] > key){
				deck[j+1] = deck[j];
				j = j-1;
			}
			deck[j+1] = key;
		}
		System.out.print("\nSorted Deck is :");
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i]+" ");
		}
	}
}