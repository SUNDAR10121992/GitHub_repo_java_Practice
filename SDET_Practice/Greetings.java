package SDET_Practice;

import Constructor.newclass;

public class Greetings {

	public static void main(String[] args) {

		Greetings greetings = new Greetings();
		greetings.m1();

		String s = greetings.m2();
		
		System.out.println(s);
		
		greetings.m3("john");
		
		System.out.println(greetings.m4("Sundar"));
	}

	
	// No param no return value
	    void m1() {
	
		System.out.println("Helo.......");
	}

    
	//No param  returns value 
	    String m2() {

		return "hello how are you...";
	}


	// Take params but no return value
	     void m3(String name) {
		
	    	 System.out.println("Hello " + name);
	}
	
	//Take param return Value 
	
	String  m4(String name)
	{
		return ("Hello.."+name);
	}
 }
