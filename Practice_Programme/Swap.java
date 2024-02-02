package Practice_Programme;

public class Swap {

	public static void main(String args[]) {
		int a = 10, b = 20;
		System.out.println("Before swapping values are " + a + "   " + b);

		// logic 1 using third variable

		int c = a;

		a = b;
		b = c;
		System.out.println("Before swapping values are " + a + "   " + b);

		
		//Logic 2 using Add and substract 
		System.out.println("=++++++++++++++2nd logic++++++++++");
		a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		System.out.println("After swapping "+a+"   "+b);
		
		
		System.out.println("=====logic 3========");
		
		//here a and b should not be zero 
		
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("This is by 3rd logic "+a+"  "+b);
		
		System.out.println("===========using 4th with single statement =================");
		
		
		b=a+b-(a=b);
		
		System.out.println("After 4th logic  a is "+a+"  and b is  "+b);
		
	
		
	}
}
