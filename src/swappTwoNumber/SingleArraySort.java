package swappTwoNumber;

import java.util.Arrays;

public class SingleArraySort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2, 3,1,4};
		int i = 1;
		while (i < (a.length - 2)) {
			if (a[i] > a[i + 1]) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				i = -1;
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
