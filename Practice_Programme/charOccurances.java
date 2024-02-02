package Practice_Programme;

public class charOccurances {
	public static void main(String[] args) {

		String str = "Welcome to Restaurant";
		getCharoccurances(str, 't');
		getoccurance(str, 'o');
	}

	public static void getoccurance(String str, char val) {

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == val) {
				count++;
			}
		}
		System.out.println(val + "::" + count);

	}

	public static void getCharoccurances(String str, char val) {

		int count = 0;
		for (char c : str.toCharArray()) {
			if (c == val) {
				count++;
			}
		}
		System.out.println(val+ "::"+ count);
	}
}
