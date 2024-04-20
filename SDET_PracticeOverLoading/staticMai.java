package SDET_PracticeOverLoading;

public class staticMai {

	 public static void  main(String []args ) {

		StaticDemo s = new StaticDemo();
		
		  System.out.println(StaticDemo.a);
		 
		  StaticDemo.m1(); 
		 
		  System.out.println(s.b); 
		 
		  s.m2();
		 
		  s.m();
		  
		  System.out.println(StaticDemo.s);
		
		  System.out.println("length of string "+s.len);
	}
}
