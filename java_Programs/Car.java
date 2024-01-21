package java_Programs;

public class Car {
	// car var

	int model;
	int wheel;

	public static void main(String args[]) {
		
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
//Here  new Car is object of car class 
		//new key word is used to create object 
		//a. b, c ,is refernce  variables
		
		a.model = 2015;
		a.wheel = 4;

		b.model = 2014;
		b.wheel = 4;

		c.model = 2013;
		c.wheel = 4;
		System.out.println("+++++++****+++++Before assigning references++++*****+++++ ");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);
		System.out.println(c.model);
		System.out.println(c.wheel);
		System.out.println("+++++++****+++++After assigning references++++*****+++++ ");

		a=b;
		b=c;
		c=a;
		
		a.model=10;
		System.out.println(a.model);
		c.model=20;
		System.out.println(c.model);
		System.out.println(a.model);
		System.out.println(c.model);
    }
}
