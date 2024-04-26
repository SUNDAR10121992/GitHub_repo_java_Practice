package Practice_Programme;

import java.sql.ResultSet;

import java_Programs.staticBlock;

public class ReverseStringDemo1 {
	/*
	 * public static void main(String args[]) {
	 * 
	 * String string = "welcome";
	 * 
	 * int len = string.length(); String rev = "";
	 * 
	 * for (int i = len - 1; i >=0; i--) { rev = rev + string.charAt(i);
	 * 
	 * } String result = string.substring(0,len-3) + rev;
	 * //System.out.println(result); System.out.println(rev);
	 * 
	 * }
	 */
	public static void main(String args[]) {
		String resulString = "";
		String s = "welcome";
		String rev = "";
		int len = s.length();

		for (int i = len - 1; i >= len - 5; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
		resulString=s.substring(0,len-5)+rev;
		
		System.out.println(resulString);
	}

}
