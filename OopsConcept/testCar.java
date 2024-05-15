package OopsConcept;



public class testCar extends BMW {
	public static void main(String args[]) {

		// Compile time polymorphism or static poly:It means java will decide which
		// methode need to execute at the time of compilation

		BMW b = new BMW();
		b.start();// When methode present with same name with same number of arg. is called
		b.stop(); // overriding
		b.refuel();
		// b.engine();
		//b.theftSafety();
		//b.engine();
//		Vehicle v = new BMW();
//		v.engine();
//		v.start();

		// child class object can be referred by Parent class refernce variable----is
		// called --dynamic polymorphism or run time polymorphosm
		// or Top Casting

		// down casting is not possible
		// BMW b1=(BMW)new Car();
		// it will give Class cast expetion ----downn casting not possible

	}
}


