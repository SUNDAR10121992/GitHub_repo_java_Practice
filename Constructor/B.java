package Constructor;

public class B extends A {

	public static void start() {
		System.out.println("Start======B");
	}

	public static void start(int a) {
		System.out.println("Start======B");
	}

	public static void main(String args[])

	{
		B b = new B();
		b.start();
	}

}