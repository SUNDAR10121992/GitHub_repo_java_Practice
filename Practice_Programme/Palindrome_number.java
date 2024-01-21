package Practice_Programme;

public class Palindrome_number {
	public static void main(String args[]) {
//		ispalindrome(123);
	ispalindrome(333);
		//ispalindrome(1551);

	}

	public static void ispalindrome(int num) {
		int sum = 0;
		int r = 0;
		int t;
		t = num;

		while (num > 0) {
			r = num % 10;

			sum = (sum * 10) + r;
			num = num / 10;

		}
		if (t == sum)

		{
			System.out.println("is palindrome ");

		} else {
			System.out.println("is not palindrome ");

		}

	}
}
