package Practice_Programme;

import java.util.HashSet;

public class Duplicates_elment_in_Array2 {
	public static void main(String[] args) {
		String s2[] = { "sachin", "sundar", "java", "c++", "c#", "sachin", "Amol" };
		boolean flag = false;
		HashSet<String> hs = new HashSet<String>();
		for (String s1 : s2) {
			if (hs.add(s1) == false) {

				System.out.println("Duplicat ele found that is == " + s1);
				flag = true;
			}

		}
		if (flag == false) {
			System.out.println("No Duplicat found");
		}
	}
}
