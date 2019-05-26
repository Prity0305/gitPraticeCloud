package clonningDeepCopy;

public class Branch implements Cloneable{
	
	private String name;
	private int totalStudent;
	public String getName() {
		return name;
	}
	public int getTotalStudent() {
		return totalStudent;
	}
	public Branch(String name, int totalStudent) {
		super();
		this.name = name;
		this.totalStudent = totalStudent;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTotalStudent(int totalStudent) {
		this.totalStudent = totalStudent;
	}
	@Override
	public String toString() {
		return "Branch [name=" + name + ", totalStudent=" + totalStudent + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
