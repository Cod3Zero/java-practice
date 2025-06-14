package practice;

public class Frequency {

	public static void main(String[] args) {
		int[] a = {1, 2, 1, 3};
		boolean[] counted = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
		    if (counted[i]) continue;
		    int count = 1;
		    for (int j = i + 1; j < a.length; j++) {
		        if (a[i] == a[j]) {
		            count++;
		            counted[j] = true;
		        }
		    }
		    System.out.println(a[i] + " - " + count);
		}

	}

}
