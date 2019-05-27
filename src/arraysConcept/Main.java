package arraysConcept;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass t = new TestClass();
		t.changeValue(2, 20);
		System.out.println(Arrays.toString(t.getI()));
		
		TestClass t1 = new TestClass();
		//for(int i=0; i< t1.getI().length; i++) {
			System.out.println(Arrays.toString(t1.getI()));
		//}
	}

}
