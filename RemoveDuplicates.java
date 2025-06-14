package practice;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = {1, 2, 2, 3, 1};
		int k = 0;

		for (int i = 0; i < a.length; i++) {
		    boolean duplicate = false;
		    for (int j = 0; j < k; j++) {
		        if (a[i] == a[j]) {
		            duplicate = true;
		            break;
		        }
		    }
		    if (!duplicate) {
		        a[k] = a[i];
		        k++;
		    }
		}

		for (int i = 0; i < k; i++) System.out.print(a[i] + " ");

	}

}
