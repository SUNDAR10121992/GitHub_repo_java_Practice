package Practice_Programme;

public class palindromNumber1 {
	public static void main(String[] args) {
		int i = 12233221;

		String original = Integer.toString(i);
		String reversed = new StringBuilder(original).reverse().toString();

		// return original.equals(reversed);
		if (original.equals(reversed)) {
			System.out.println(i + " is a palindrome.");
		} else {
			System.out.println(i + " is not a palindrome.");
		}
	}
}
