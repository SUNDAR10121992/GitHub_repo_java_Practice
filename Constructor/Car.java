package Constructor;

public class Car {

	String name;
	int price;
	String engine;

	public Car(String name, String engine, int price) {
		this.name = name;
		this.price = price;
		this.engine = engine;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car("BMW", "Automatice", 10);

		Car c1 = new Car("Audi", "Automatice", 20);
		Car c3 = new Car("merc", "Automatice", 50);
		
		System.out.println(c.name+" "+c.price+" "+c.engine);
		System.out.println(c1.name+" "+c1.price+" "+c1.engine);
		System.out.println(c3.name+" "+c3.price+" "+c3.engine);
		


	}

}
