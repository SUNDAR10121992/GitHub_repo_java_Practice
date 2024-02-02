package Practice_Programme;

public class palindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ispalindrom("ABBBA");
	}

	public static void ispalindrom(String s) {
		String rev = "";
		int len = s.length();
		String originalString = s;
		
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (rev.equals(originalString)) {
			System.out.println("is palindroe ");
		} else {
			System.out.println("not palindrome");
		}
	}

}
