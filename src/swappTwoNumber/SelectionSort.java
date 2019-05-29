package swappTwoNumber;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 64, 25, 12, 22, 11 };
		for (int i = 0; i < a.length-1; i++) {
			int min_index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min_index] > a[j]) {
					min_index = j;
					
				}
			}
				int temp = a[i];
				a[i] = a[min_index];
				a[min_index] = temp;
		}
		System.out.println(Arrays.toString(a));

	}
	
	

}
