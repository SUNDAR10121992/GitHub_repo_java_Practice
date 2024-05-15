package Practice_Programme;

import java.util.Arrays;

public class Arrays_Equality {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = { 1, 2, 3, 4, 5, 6 };
		
boolean status=true;
if(a.length==b.length)
{
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=b[i])
		{
			status =false;
			
		}
	}
	
	
}
else {
	System.out.println("Array is not equal");
	
}
	if(status==true)	
	{
		System.out.println("Aaray is equal ");
		
	}else {
		System.out.println("Not equal");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
//Approach 1
//		boolean status = Arrays.equals(a, b);
//
//		if (status == true)
//
//		{
//			System.out.println("Both Array are equal");
//
//		}else {
//			System.out.println("Not eqaul");
//		}
	}
}
