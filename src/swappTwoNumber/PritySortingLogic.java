package swappTwoNumber;

import java.util.Arrays;

public class PritySortingLogic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 64, 25, 12, 22, 11 };

		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
