package practice;
import java.util.*;
public class printer {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		for (int i=0;i<arr.length-1;i++){
			System.out.println(arr[i]+" ");
			
		}
		System.out.println("Length of the array is "+arr.length);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index number: ");
		int n = sc.nextInt();
		if (n>arr.length-1){
			System.out.println("Index out of bounds");
		}
		else{
			System.out.println("Array element at index"+n+"is "+arr[n]);

		}
		int temp=0;
		for (int i=0;i<arr.length-1;i++){
			temp+=arr[i];
		}
		System.out.println("Sum of all elements in the array: "+temp);
		System.out.println("Average of all elements in the array: "+(temp/arr.length));
		int max = arr[0];             

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
		System.out.println("Maximum element in the array: "+max);
		int min = arr[0];             

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
		System.out.println("Minimum element in the array: "+min);
		int even=0;
		int odd=0;
		for (int i=0;i<arr.length-1;i++){
			if (arr[i]%2==0) even+=1;
			
			else odd+=1;
		}
		System.out.println("Total odd element in the array: "+odd);
		System.out.println("Total even element in the array: "+even);
		int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp1 = arr[start];
            arr[start] = arr[end];
            arr[end] = temp1;
            start++;
            end--;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        

	}

}
