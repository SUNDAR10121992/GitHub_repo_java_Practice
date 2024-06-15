package OopsConcept;

public class TestBank {
	public static void main(String[] args) {

		HDFCbank h = new HDFCbank();
		h.credit();
		h.debit();
		h.loan();

		Bank bank = new HDFCbank();
		bank.loan();
		bank.credit();
		bank.debit();
	
	
	}

}
