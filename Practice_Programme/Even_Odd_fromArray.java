package Practice_Programme;

public class Even_Odd_fromArray {
public static void main(String[] args) {
	
	int a[]= {12,23,3,2,3,4,44};
	int len=a.length;
	System.out.println("Even numbers are ");
	
//	Enhanced loop
	for(int value:a)
	{
		if(value%2==0)
			{
			System.out.println(value);
			}
		
	}
	System.out.println("Odd numers are ");
	for(int value:a)
	{
		if(value%2!=0)
			{
			System.out.println(value);
			}
		
	}	
//	for(int i=0;i<=len-1;i++)
//	{
//		if(a[i]%2==0)
//			System.out.println(a[i]);
//		
//	}
//	System.out.println("odd numbers are ");
//
//	for(int i=0;i<=len-1;i++)
//	{
//		if(a[i]%2!=0)
//			System.out.println(a[i]);
//		
//	}	
}
}
