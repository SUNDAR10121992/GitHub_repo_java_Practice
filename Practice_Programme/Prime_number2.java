package Practice_Programme;

import java.util.Scanner;

public class Prime_number2 {

	public static void main(String[] args) {

		isPrimeNumber(13);
		isPrimeNumber(15);
	}

	public static void isPrimeNumber(int number) {
		// TODO Auto-generated method stub
		int count = 0;
		if (number >= 1) {

			for (int i = 1; i <= number; i++)

				if (number % i == 0) {
					count++;
				}
			if (count == 2) {
				System.out.println(number + " is Prime ");
			} else {
				System.out.println(number + " Is not Prime ");
			}

		} else {

			System.out.println(number + " is Not Prime Number");
		}
	}
}
