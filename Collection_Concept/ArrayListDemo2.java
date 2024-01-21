package Collection_Concept;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String args[]) {

		String arr[] = { "Dog", "Cat", "Elephant" };

		for (String value : arr) {

			System.out.println(value);
		}
		List al = new ArrayList(Arrays.asList(arr));
		System.out.println(al);

	}

}
