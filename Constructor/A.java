package Constructor;

public class A {
	int i = 12;
	String string;

	public A() {
		System.out.println("parent class Constructor with no param");
	}

	public A(int a) {
		System.out.println("parent  class constructoer with single param " + a);
	}

	public A(int i, int j) {
		System.out.println("parant constructor with 2 param " + i + " " + j);
	}
}
