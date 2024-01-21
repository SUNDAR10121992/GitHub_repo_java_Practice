package Practice_Programme;

import java.util.Scanner;

public class largest_numberdemo2 {
	
	public static void largest_number(int a,int b, int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a   +" is  largest ");
			
		}
		else if(b>a && b>c)
		{
			System.out.println(b   +" is largest ");
			
		}
		else {
			System.out.println(c  +"  is largest ");
		}
	}
public static void main(String[] args) {
	
	largest_number(123,99,87);
}

}
