package Practice_Programme;

public class CountOfEven_and_OddNuber {

	public static void count_even_and_Odd(int num) {
		int n = num;
		int evenCount = 0;
		int oddCount = 0;
		int count = 0;

		while (num > 0) {

			int rem = num % 10;

			if (rem % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num = num / 10;
			count++;
		}

		System.out.println(n + " in this number  even digits are ==" + evenCount);
		System.out.println(n + " in this number  odd digits are==" + oddCount);
		System.out.print("        ");
		System.out.println(n + "  count is " + count);
	}

	public static void main(String args[]) {
		count_even_and_Odd(12345);
		count_even_and_Odd(983989845);
//		count_even_and_Odd(12323);
//		count_even_and_Odd(189732);
	}
}
