package swappingAndSortingNumber;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 2, 3, 1, 5 };
		for (int i = 0; i < a.length-1; i++) {
			boolean swap = false;
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]> a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swap = true;
				}
			}
			if(swap == false) {
				break;
			}
		}
		System.out.println(Arrays.toString(a));

	}
	
	

}
