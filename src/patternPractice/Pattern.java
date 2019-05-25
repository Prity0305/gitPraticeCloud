package patternPractice;

public class Pattern {

	public static void main(String[] args) {
		int n = 3;
		int i = n-1;
		while (i>=0) {
			int j =0;
			while(j<n*2) {
				if(j>=i && (i+j+1)<n*2) {
					System.out.print("*"+" ");
				}
				else {
					System.out.print("--");
				}
				j++;
			}
			System.out.println();
			i--;
		}
	}

}
