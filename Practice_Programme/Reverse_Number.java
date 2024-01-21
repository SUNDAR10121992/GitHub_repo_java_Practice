package Practice_Programme;

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String args[]) {
		// Using String buffer
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int num = sc.nextInt();

         //logic 2 
		StringBuffer rev;

		StringBuffer sb = new StringBuffer(String.valueOf(num));

		rev = sb.reverse();

		System.out.println(rev);
        
		StringBuilder sb1 = new StringBuilder();

		sb1.append(num);
		sb1.reverse();
		System.out.println(sb1);

	}

}
