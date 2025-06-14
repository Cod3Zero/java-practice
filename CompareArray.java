package practice;

public class CompareArray {

	public static void main(String[] args) {
		int[] a = {1, 2}, b = {1, 2};
		boolean same = true;
		if (a.length != b.length) same = false;
		else {
		    for (int i = 0; i < a.length; i++) {
		        if (a[i] != b[i]) {
		            same = false;
		            break;
		        }
		    }
		}
		System.out.println(same);

	}

}
