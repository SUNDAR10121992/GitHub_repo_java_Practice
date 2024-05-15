package Practice_Programme;

public class Linear_Search {

	public static void main(String[] args) {
		int a[] = { 12, 23, 3, 22, 15, 1, 2 ,3};
		boolean status = false;

		int search_ele = 3;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			if (search_ele == a[i]) {
				System.out.println(search_ele+ "::element found at:: "  + i);
				status = true;
				
			}
		}
		if (status == false) {
			System.out.println("Elemt Not found ");
		}
	}
}
