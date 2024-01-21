package Patterns_Practive;

public class pattern_demo3 {
	public static void main(String[] args) {
		int n = 5;
		int count;
		for (int i = 1; i <= n; i++) {

			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			// provide space it will give pyramid star pattern
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
