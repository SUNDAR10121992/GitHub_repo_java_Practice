package Patterns_Practive;

public class Pattern_Demo1 {

	public static void main(String[] args) {
		int count;
		for (int i = 0; i < 5; i++) {
			count = i + 1;
			for (int j = 0; j < 5; j++) {
				System.out.print(count++ + " ");
			}
			count = i + 1;
			System.out.println();
		}
	}

}
