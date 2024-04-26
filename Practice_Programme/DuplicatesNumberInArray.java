package Practice_Programme;

import java.util.HashSet;

public class DuplicatesNumberInArray {

	public static void main(String[] args) {
		int a[] = { 6, 3, 4, 5, 6, 7, 3, 2, 5 };
		/*
		 * int count=0; int len=a.length; for(int i=0;i<len;i++)
		 * 
		 * { for(int j=i+1;j<len;j++) { if(a[i]==a[j]) { System.out.println(a[i]+
		 * " is duplicate number "); count++; } }
		 * 
		 * } System.out.println("total duplicate is "+count);
		 * 
		 */
		
		HashSet<Integer> hs = new HashSet<Integer>();
		int count = 0;
		for (int num : a) {
			if (hs.add(num) == false) {
				count++;
				System.out.println(num + " is duplicate in array  ");
			}
		}

		System.out.println("total number of duplicate is  "+count);
	}
}