package New_Practice;

import Practice_Programme.charOccurances;
import java_Programs.staticBlock;

public class Char_occurance {

	public static void main(String[] args) {

		String str = "welcome to java";
		getCharOccurance(str, 'a');
		getchar_occurance(str, 'e');
	}

//approach 1
	public static void getchar_occurance(String str, char val)

	{
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println(val + ":" + count);
	}

//approach 2
	public static void getCharOccurance(String str, char val)

	{
		int count = 0;

		for (char c : str.toCharArray())

		{
			if (c == val) {
				count++;
			}
		}

		System.out.println(val + ":" + count);
	}
}
