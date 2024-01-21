package Interface_Practice;

public class Test_bank {

	void test() {

	}

	public static void main(String args[]) {

		HDFCbank hb = new HDFCbank();
		hb.credit();
		hb.deposit();
		hb.ATM_charges();

		Bank b = new HDFCbank();
		b.loan();
		b.credit();
		b.ATM_charges();
		System.out.println(b.amt);
		System.out.println(Bank.loanRate);
		System.out.println(b.rate);
	}

}
