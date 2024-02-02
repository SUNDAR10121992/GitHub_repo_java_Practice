package Practice_Programme;

public class Largest_Numbers_demo1 {
	public static void main(String[] args) {

		int a = 3456;
		int b = 456;
		int c = 232;
		int largest = a;

		if (b > largest) {
			largest = b;
		}
		if (c > largest) {
			largest = c;

		}
		System.out.println("the largest number is " + largest);
	}
}
