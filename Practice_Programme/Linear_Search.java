package Practice_Programme;

public class Linear_Search {

	public static void main(String[] args) {
		int a[] = { 12, 23, 3, 22, 15, 1, 2, 30, 3 };
		boolean status = false;

		int search_ele = 33;
		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			if (search_ele == a[i]) 
			{
				System.out.println("element found " + i);
				status = true;
				break;
			}

		}
		if (status == false) {

			System.out.println("Elemt Not found ");

		}
	}

}
