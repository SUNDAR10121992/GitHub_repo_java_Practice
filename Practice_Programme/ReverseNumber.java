package Practice_Programme;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("enter number: ");
		  
		  int num=sc.nextInt(); 
		  int org_Num=num;
		 
		//1.Use 
		
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
	
		//check number is palindrome or not 	
		
		for (; num != 0; num /= 10) 
		
		{
	    
			rev = rev * 10 + num % 10;
	        
		}
	        //using string buffer reverse methode 
		
		long num1=123456;
		//System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	    String string1=	String.valueOf(num1);
		StringBuffer string=new StringBuffer(string1).reverse();
		
		System.out.println(string);
		/*
		 * if(org_Num==rev) { System.out.println("Number is palindrome ");
		 * 
		 * } else { System.out.println("Number is not palindrome "); }
		 */
		 
	}
}
