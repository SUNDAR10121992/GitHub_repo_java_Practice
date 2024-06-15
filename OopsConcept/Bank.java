package OopsConcept;

public abstract class Bank {

	abstract void loan();// abstrct method===no body

	void credit() {
		System.out.println("Bank credit ");
	}

	void debit() {
		System.out.println("bank debit ");
	}
}
