package clonning;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		//Student s = new Student("Subhash",30,"Mechanical");
		Student s = new Student();
		s.setName("Subhash");
		s.setAge(30);
		s.setBranch("Mechanical");
		
		
		Student newS = s;
		
		System.out.println(newS == s);
		System.out.println(newS.getClass() == s.getClass());
		System.out.println(newS.equals(s));
		
		
		/*
		 * System.out.println("Old s value: "+ s);
		 * System.out.println("Old newS value: "+ newS ); newS.setName("Prity");
		 * newS.setAge(28); newS.setBranch("CS");
		 * 
		 * System.out.println(); System.out.println(newS == s);
		 * System.out.println("New s value: "+ s);
		 * System.out.println("New newS value: "+ newS );
		 */
		
		
		
		
		
		
		
		/*
		 * Student newS = (Student)s.clone(); System.out.println("Old s Value: "+ s);
		 * System.out.println("Old newS Value: "+ newS); newS.setName("Prity");
		 * newS.setAge(28); newS.setBranch("CS"); System.out.println("New newS Value: "+
		 * newS); System.out.println("New s Value: "+ s);
		 */
		
		
		
	}

}
