package arraysConcept;

import java.util.Arrays;

public class Test {
	private static int[] j = new int[3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//{10,20,30,40,50}; 
		System.out.println("Length of the array is : "+j.length);
		
		for(int i = 0 ; i<= j.length -1; i++) {
			j[i]= (i +1)*10;
		}
		
		System.out.println(Arrays.toString(j));
		System.out.println("Main method Completed");
		
		

	}

}
