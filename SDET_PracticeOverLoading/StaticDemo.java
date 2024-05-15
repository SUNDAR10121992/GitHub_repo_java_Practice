package SDET_PracticeOverLoading;


import java_Programs.staticBlock;

public class StaticDemo {

//static methode can access static stuff directly 
// static methodes can acces not static stupff through object
// non static methodes can access directly all stuff directly
	static int a = 10;
	int b = 20;
	public static void main(String[] args) {
	
	  m1();
	}
	  static String s="welcome";
	    int len=s.length();

	static void m1() {
	
		System.out.println("this is m1 static methode-----");

	}

	void m2() {
		System.out.println(b);
		System.out.println("this is non static methode ");

	}

	void m() {
		m1();
		m2();
		System.out.println(a);
		System.out.println(b);

	}

}
