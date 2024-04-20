package Constructor;

import javax.sql.rowset.JoinRowSet;

import inheritance_concept.mysuperClass;

public class B extends A {

	public B() {
		super(12);
		System.out.println("child cla ss constructor " + super.i);

	}

	public B(int i) {
		super(111);
		System.out.println("chile class "+i);
	
	}

	public B(int e, int p) {
		super(23, 234);
		System.out.println("child constructor eith 2 param");
	}

	public static void main(String[] args) {
		B b = new B();
		B b2 = new B(0);
		B b1 = new B(12, 23);

	}
}