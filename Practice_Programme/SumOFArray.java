package Practice_Programme;

public class SumOFArray {
	public static void main(String[] args) {

		int a[] = { 12, 12, 0, 0, 12, 12 };

		int sum=0;
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			sum+=a[i];
		}
		
		System.out.println(sum);
	}

}
