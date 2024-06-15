package static_block_practice;

public class question6 {
//what will be o/p of executing following class 

	static {
		System.out.println("Static block");

	}
	{
		System.out.println("Instance initializer");
	}

	question6() {

		System.out.println("Construtor");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		new question6();
	}
}
