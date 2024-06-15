package OopsConcept;

public class StringImmutable {

	public static void main(String[] args) {

		String x = "abc";

		String y = "abc";

		x = x.concat(y);

		System.out.println(y);
		System.out.println(x);
	}

}
