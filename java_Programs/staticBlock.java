package java_Programs;

public class staticBlock {
	public static void main(String args[]) {

		// JVM will start to search with (String args[])--Then it will execute

		System.out.println("main methode0");
		main("Testing ");
		main(10);
		main(2, 3);
	}

	public static void main(int a) {
		System.out.println("main methode1");

	}

	public static void main(int a, int b) {
		System.out.println("main methode3");

	}

	public static void main(String args) {
		System.out.println("Main methode3");

	}

}
