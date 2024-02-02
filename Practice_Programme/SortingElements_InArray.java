package Practice_Programme;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements_InArray {
	public static void main(String[] args) {

		int a[] = { 40, 2, 10, 333, 5 };

		System.out.println("Arrray before sorting " + Arrays.toString(a));

		int len = a.length;
		// System.out.println(len);

		for (int i = 0; i < len - 1; i++)// number of passese
		{
			for (int j = 0; j < len-1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		///
	  System.out.println("Arrays after sorting " + Arrays.toString(a));

	}
}
