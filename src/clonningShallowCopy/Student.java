package clonningShallowCopy;

public class Student implements Cloneable{
	
	
	private String name;
	private int age;
	private Branch branch;
	public Student(String name, int age, Branch branch) {
		super();
		this.name = name;
		this.age = age;
		this.branch = branch;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Branch getBranch() {
		return branch;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", branch=" + branch + "]";
	}
	
	
	
	

}
