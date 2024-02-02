package Practice_Programme;

public class String_manipulation {

	public static void main(String args[]) {
		String str = "The rains have started heres selenium";
		String str1 = "the rains have started heres selenium";
		System.out.println(str.indexOf("s"));
		System.out.println(str.charAt(5));
		// System.out.println(str.indexOf("s", str.indexOf("s") + 1));
		int secondIndex = str.indexOf("s", str.indexOf("s") + 1);
		int thirdIndex = str.indexOf("s", secondIndex + 1);
		int fourthIndex = str.indexOf("s", thirdIndex + 1);
		System.out.println(thirdIndex);
		System.out.println(fourthIndex);
		System.out.println(str.equals(str1));

		
		
		
	}
}
