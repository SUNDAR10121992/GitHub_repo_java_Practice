package inheritance_Concept;

public class mysuperClass {
	String superstr = "super class string ";
	String commonstr = "super common str";

	public mysuperClass(String constructor) {
		System.out.println("super class constructor");
		System.out.println(constructor);
	}

	public void superClassMethode() {
		System.out.println("super class methode");

	}
	public void commonMethode()
	{
		System.out.println("SuperCommn methode");
	}
}
