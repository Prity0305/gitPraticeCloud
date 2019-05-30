package thisKeywordConcept;

public class Test {
	private int a ;
	private int b;
	
	public Test() {
	//	this(10,20);
		System.out.println("gvhvgujg");
	}

	public Test(int a, int b) {
		this(10,29,30);
		this.a = a;
		this.b = b;
	}
	
	
	public Test(int a, int b, int c) {
		
		this.a = a;
		this.b = b;
	}
	
	public void myMethodTwo() {
		/*
		 * Test t = new Test(); myMethod(t);
		 */		
		myMethod(this);
	}
	
	public Test myMethod(Test t) {
		return this;
	}
	
}
