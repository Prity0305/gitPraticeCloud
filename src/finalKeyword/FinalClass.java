package finalKeyword;

// if a class is final, that's it cannnot be extended, which also mean it cann not be inherited
public class FinalClass {
	// Final variable much initialized;
	final int b = 10;
	
	/*
	 * if you forgot to intialized any finala and static  variable you can initialised
	 * it in static block or constructor
	 */	
	final static int a;
	
	static {
		a = 20;
	}
	
	/*
	 * if you forgot to intialized any finala   variable you can initialised
	 * it in  constructor
	 */	
	final int c;
	// This is the right way
	public FinalClass() {
		c = 30;
	}

	
	// This is the WRONG way
		public FinalClass(int c) {
			this.c = c; // As it value can be change with creation of every new object.
		}
}
