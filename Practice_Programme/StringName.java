package Practice_Programme;

import SDET_PracticeOverLoading.StaticDemo;
import java_Programs.staticBlock;

public class StringName {
	static String string = "welcome";

	public static void main(String[] args) {

		String string1 = "welcome1";
		System.out.println(string1);
		System.out.println(string1);

		System.out.println(m1());

	}

	static {
		System.out.println(string);
	}

	static String m1() {
		return "my world ?";
	}
}
