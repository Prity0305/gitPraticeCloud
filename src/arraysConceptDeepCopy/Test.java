package arraysConceptDeepCopy;

public class Test {
	private int[] i = {2,4,6};
	
	public void copyArray(int[] value) {
		for(int j = 0 ;j < i.length; j++) {
			value[j] = i[j] ;
		}
	}

	public int[] getI() {
		return i;
	}
}
