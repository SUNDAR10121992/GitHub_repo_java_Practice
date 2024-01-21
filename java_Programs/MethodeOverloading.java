package java_Programs;

public class MethodeOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodeOverloading obj = new MethodeOverloading();
		obj.sum();
		obj.sum(1);
		obj.sum(12, 23);
	}

	public static void main(int  e) {

	}

	public static void main(int v ,int s ) {

	}
	// we can overload main methode
//when methode name is same with differeent argument/parameter  within same class 
	// we cant create methode withing methode
	// duplicate methode not allowed -----i.e same methode name with same name is
	// not allowed

	public void sum() {
		System.out.println("Sum  no param");

	}

	public void sum(int k) {
		System.out.println("sum methode  1 param " + k);

	}

	public void sum(int i, int r) {

		System.out.println("Sum  wit 2 param " + i + " and " + r);
	}
}
