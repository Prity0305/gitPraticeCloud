package swappingAndSortingNumber;

public class WithoutUsingThreeVariable {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		System.out.println("A: "+ a +", B: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A: "+ a +", B: "+b);
		
	}
}
