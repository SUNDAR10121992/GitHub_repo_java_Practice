package static_block_practice;

public class Question1 {

	// What is static block

	// static block created with static keyword
	// before main methode static block will execute
	// when JVM will load class immediately static block will be executed

	static {
		System.out.println("Static block ");
	}

	public static void main(String[] args) {
		System.out.println("main methode");
	}
}
