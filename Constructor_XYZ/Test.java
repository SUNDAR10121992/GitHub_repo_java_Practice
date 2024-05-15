package Constructor_XYZ;

public class Test {

	public static void main(String[] args) {
		Testing testing = new Testing();
		Test test = new Test();
		test = null;

		System.gc();

	}

	public void finalize() {
		System.out.println("Garbage ollector ");
	}

}
