package Practice_Programme;

public class ReverseStringDemo1 {
	public static void main(String args[]) {
		// using string concatation
		String str = "ABCDEFG";
		String rev = "";
		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println(rev);

	}

}
