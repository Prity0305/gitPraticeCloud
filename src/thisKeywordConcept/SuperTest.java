package thisKeywordConcept;

public class SuperTest extends ParentClass {
	private int i;

	public SuperTest() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("This is default constructor");
		
	}

	public SuperTest(int i) {
		this();
		this.i = i;
		System.out.println("This is Parameterised constructor");
	}
	
	
}
