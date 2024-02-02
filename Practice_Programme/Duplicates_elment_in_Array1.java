package Practice_Programme;

public class Duplicates_elment_in_Array1 {

	public static void main(String args[]) {
		// Approach --1
		int count = 0;
		String s[] = { "java", "selenium", "c++", "c#", "c#", "Sceince", "c++" };
		boolean flag = false;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j]) {
					System.out.println("Found duplicate element  is " + s[i]);
					count++;
				flag = true;
				}
			}

		}
		System.out.println("Total number of  duplicate are  " + count);
	if (flag == false) {
		System.out.println("Not found");
		}
	}
}
