package Constructor;

public class Constructor_Concept {

	 String name;
	 int age;

	public Constructor_Concept() {
		System.out.println("Default Constructor ");

	}

	public Constructor_Concept(int a) {
		System.out.println("Single param of Int  ");
	}

	public Constructor_Concept(int a, int b) {
		System.out.println("two params ");

	}

	public Constructor_Concept(String a) {
		System.out.println("Singl para of string");
	}

	public Constructor_Concept(String name, int age) {
		this.age = age;
		this.name = name;

	}

	public static void main(String args[]) {
		Constructor_Concept obj = new Constructor_Concept();

		Constructor_Concept h = new Constructor_Concept(10);
		Constructor_Concept i = new Constructor_Concept(12, 23);
		Constructor_Concept j = new Constructor_Concept("sachin");
		Constructor_Concept obj1 = new Constructor_Concept("sachin", 28);

		System.out.println(obj1.name);
		System.out.println(obj1.age);

	}
}
