package Interface_Practice;

public abstract class Bank {
	 
	
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;

	// partial abstraction
	// hiding the implementation
	// Abs class can abs methods and non abs methods
	// we can acheive 0 to 100 percent abstraction
	// Can not create object of abstract class

	public abstract void loan();// abstract methode ===no body

	public abstract void ATM_charges();

	public void deposit() {// non abstract
		System.out.println("Deposit methode-===Bank");

	}

	public void credit() {
		System.out.println("Credit metode ======bank ");

	}

}
