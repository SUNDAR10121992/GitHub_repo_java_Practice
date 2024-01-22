package inheritance_concept;

public class myclass {
	public static void main(String[] args) {
		mySubClass mysubclass = new mySubClass("constructor string from my class");

		mysubclass.superClassMethode();

		System.out.println(mysubclass.superstr);

		mysubclass.subclassMethode();

		mysubclass.printcommonstring();
		mysubclass.PrintcommonMethode();
		
	}
}
