package Practice_Programme;

import java.util.Scanner;

public class Palindrom_String {

	public static void main(String args[])

	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter strng ");
//		String input = sc.next();
//		boolean ispalindrome = checkPalindrome(input);
//		if (ispalindrome) {
//			System.out.println("The string is a palindrome.");
//		} else {
//			System.out.println("The string is not a palindrome.");
//		}

	}

	public static boolean checkPalindrome(String str) {

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			// compare char. ar corresponding position
			if (str.charAt(left) != (str.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
