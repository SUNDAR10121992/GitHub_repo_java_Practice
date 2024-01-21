package java_Programs;

public class StaticAndNonStatic {

	String name = "Sundar";//non static var
	static int age = 31;  //static var 

	public static void main(String args[]) {
		//Calling static methode and var
		//1. direct calling 
		//2. calling by class name 
		
		sum();
		StaticAndNonStatic.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
		
		//how to call non static var and methodes 
		StaticAndNonStatic obj=new StaticAndNonStatic();
		System.out.println(obj.name);
        
		
		obj.sendMail();
		//we can access  static methodes and var by using object refernece  but it will waring 
		
		//warning will given 
		
		
		
		
				
	}

	public void sendMail() {// non static
		System.out.println("send mail non static ");

	}

	public static void sum() {// static methode
		System.out.println("Sum methode Static methode ");

	}
}
