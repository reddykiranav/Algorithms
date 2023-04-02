package random;

public class FirstDup {

	public static void main(String[] args) {
		int a[] = {2,5,1,1,1,5,6};
		boolean found = false;
		for(int i = 0; i < a.length; i++){
			for(int j = i+1;j<a.length;j++){
				if(a[j] == a[i]){
					found = true;
					break;
				}
			}
			if(found){
				System.out.println("First Dup "+a[i]);
				break;
			}
		}
	}
}
