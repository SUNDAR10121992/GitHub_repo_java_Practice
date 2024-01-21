package inheritance_Concept;

public class mySubClass extends mysuperClass {
	String commonstr = "Sub common str";

	public mySubClass(String constructorStr) {
		super(constructorStr);
		System.out.println("My subclass construtor");

	}

	public void subclassMethode() {
		System.out.println("Subclass methode");
	}
	public void printcommonstring() {
		System.out.println(commonstr);
		System.out.println(super.commonstr);
	
	}
	public void commonMethode()
	{
		System.out.println("Subclass common methode");
	}
	public void PrintcommonMethode()
	{
		super.commonMethode();
		commonMethode();
	}
	
}
