package Practice_Programme;

public class Missing_number_inAaray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5,6,8,9,10};
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i <= a.length-1; i++) {
			sum1 += a[i];

		}
		System.out.println(sum1 + " is Sum of number in array ");
		for (int i = 1; i <= 10; i++) {
			sum2 += i;

		}
		System.out.println(sum2 + " is Sum of number in array ");
	
		System.out.println("missing number is "+(sum2-sum1));
		
		
	}
	
}
