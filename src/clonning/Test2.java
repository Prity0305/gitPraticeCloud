package clonning;

public class Test2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("Subhash");
		s.setAge(30);
		s.setBranch("Mechanical");

		Student newS = (Student) s.clone();
		System.out.println(newS == s);
		//System.out.println(2 == 2);
		System.out.println(s.getClass() == newS.getClass());
		System.out.println(newS.equals(s));
		System.out.println();
		System.out.println("Original s value: "+ s);
		System.out.println("Original newS value: "+ newS );
		
		newS.setName("Prity");
		newS.setAge(28);
		newS.setBranch("CS");
		System.out.println();
		
		System.out.println("New s value: "+ s);
		System.out.println("New newS value: "+ newS );
		

	}

}
