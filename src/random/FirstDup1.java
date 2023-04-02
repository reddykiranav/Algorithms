package random;

public class FirstDup1 {

	public static void main(String[] args) {
		int a[] = {2,5,1,2,1,5,6};
		int b[] = new int[10];
		boolean found = false;
		int counter = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0;j<counter;j++){
				if(b[j] == a[i]){
					found = true;
					break;
				}
			}
			if(found){
				System.out.println("First Dup "+a[i]);
				break;
			}
			b[i] = a[i];
			counter ++;
		}
	}
}