package Practice_Programme;

public class Missing_number_inAaray {
	public static void main(String[] args) {

		int a[] = { 12, 13, 14, 15, 16, 18 };

		/*
		 * int sum=0;
		 * 
		 * for(int i=0;i<a.length;i++)
		 * 
		 * { sum=sum+a[i];
		 * 
		 * } System.out.println(sum);
		 * 
		 * int sum1=0; for(int j=0;j<=10;j++)
		 * 
		 * { sum1+=j; } System.out.println(sum1);
		 * 
		 * //int missig_numb=sum1-sum;
		 * 
		 * System.out.println((sum1-sum) +"  is missing number from array ");
		 */

		int sum = 0;
		for (int a1 : a) {
			sum = sum + a1;
		}
		System.out.println(sum);
        int sum1 = 0;
		for (int i = 12; i <= 18; i++)
		{
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		int miisingNumber = sum1 - sum;
		System.out.println(miisingNumber + " :: is missing number in array ");
	}
}
