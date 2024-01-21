package Practice_Programme;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ispalindrom("ABBA");

	}

	public static void ispalindrom(String s) {

		String rev = "";
		int len = s.length();
		String org_s = s;

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

		if (org_s == rev) {
			System.err.println(s + "is palindrome");

		} else {
			System.out.println("isnot palindrome ");

		}

	}

}
