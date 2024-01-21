package Constructor;

public class Constr_Concept {

	public Constr_Concept() {
		System.out.println("defaut constructor");

	}

	public Constr_Concept(int i) {
		System.out.println("Single param ");
		System.out.println("Value of i is " + i);

	}

	public Constr_Concept(int i, int j) {
		System.out.println("two param ");
		System.out.println("Value of i is " + i);
		System.out.println("value of j is j is " + j);

	}

	public static void main(String args[]) {
		Constr_Concept cc = new Constr_Concept();
		Constr_Concept cc1 = new Constr_Concept(10);
		Constr_Concept cc2=new 	Constr_Concept(10,20);

	}
}
