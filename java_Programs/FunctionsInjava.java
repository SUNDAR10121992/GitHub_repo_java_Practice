package java_Programs;

public class FunctionsInjava {
	public static void main(String args[]) {
//maain methode is void because we naver written retun statement in main methode 
		FunctionsInjava obj = new FunctionsInjava();

		// one object will be created , obj is the refernce variable , reffering to this
		// object

		// After creating the object copy of all non static methode will be given to
		// this object

		String s1 = obj.abc();
		System.out.println(s1);

		int add = obj.Addition(12, 22);
		System.out.println(add);
		int l = obj.pqr();
		System.out.println(l);
		obj.test();

	}// non static method
//return type of test is void 

	public void test() {
		System.out.println("Test ");

	}

	// return type of pqr is int
	public int pqr() {

		System.out.println("Abc methode");
		int a = 10;
		int b = 20;
		int c = a + b;
		// void means doesn't return any value

		return c;

	}

	public String abc() {
		System.out.println("metode selenium ");
		String s = "selenium ";
		return s;

	}

	// return type of addition is int
	// input parameter or argument is a and b
	public int Addition(int a, int b) {

		System.out.println("additiona methode ");
		int d = a + b;
		return d;

	}
}
