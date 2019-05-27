package arraysConcept;

public class TestClass {

	private /* final static */  int[] i = {1,2,3};

	public int[] getI() {
		return i;
	}

	public void changeValue(int position, int value) {
		i[position] = value;
	}



}
