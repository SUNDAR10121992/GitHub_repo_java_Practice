package Practice_Programme;

public class count_NumberofDigits {

	public static void main(String args[]) {
		Countdigit_inGivenNumber(13334244);
		Countdigit_inGivenNumber(12334442);
		Countdigit_inGivenNumber(1324327377);

	}

	public static void Countdigit_inGivenNumber(int num) {

//		int digit = String.valueOf(num).length();
//		System.out.println(digit);
		int count = 0;

		while (num > 0) {
			num = num / 10;
			count++;

		}
		System.out.println("Number of digits " + count);

	}
}
