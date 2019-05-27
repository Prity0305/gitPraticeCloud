package arraysConceptDeepCopy;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] val = new int[3];
		Test t = new Test();
		t.copyArray(val);
		
		
		System.out.println("Coppied array: "+Arrays.toString(val));
		
		val[0] = 10;
		
		System.out.println("Updated array: "+ Arrays.toString(val) );
		System.out.println("I array: "+ Arrays.toString(t.getI()));

	}

}
