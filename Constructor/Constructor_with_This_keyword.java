package Constructor;

public class Constructor_with_This_keyword {

	String name;
	int age;

	Constructor_with_This_keyword(String name, int age) {

		this.name = name;
		this.age = age;

		System.out.println(name);
		System.out.println(age);

	}

	public static void main(String args[]) {
		Constructor_with_This_keyword C1 = new Constructor_with_This_keyword("age", 23);

	}

}
