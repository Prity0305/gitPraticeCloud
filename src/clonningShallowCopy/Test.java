package clonningShallowCopy;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Branch b = new Branch("Mechanical", 61);
		
		Student s = new Student("Subhash", 30, b);
		
		System.out.println("Original Value: "+s);
		
		Student s1 = (Student) s.clone();
		System.out.println("Cloned value: "+ s1);
		//System.out.println(s1 == s);
		//System.out.println(s1.getClass() == s.getClass());
		//System.out.println(s1.equals(s));
		System.out.println();
		s1.getBranch().setName("CS");
		s1.getBranch().setTotalStudent(90);
		s1.setName("Prity");
		
		System.out.println("New Original Value: "+s);
		System.out.println("New Cloned value: "+ s1);
		
		

	}

}
