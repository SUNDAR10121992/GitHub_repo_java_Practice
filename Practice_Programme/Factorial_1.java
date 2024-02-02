package Practice_Programme;

import java.util.Scanner;

public class Factorial_1 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter number");
		int number=sc.nextInt();
		long factorial=1;
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
			
		}
		System.out.println(factorial);
	}
}
