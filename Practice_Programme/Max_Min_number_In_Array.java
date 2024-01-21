package Practice_Programme;

public class Max_Min_number_In_Array {
	public static void main(String[] args) {

		int a[] = { 100, 2, 3, 4, 5, 5, 6, 12, 3, 0, 5, 55 };
		int min = a[0];

		int max = a[0];
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] > max) {
				max = a[i];

			}
		}
		System.out.println("maximum ele in array is  " + max);

		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] < min) {
				min = a[i];

			}
		}
		System.out.println("minimum ele in array is  " + min);

	}
}
