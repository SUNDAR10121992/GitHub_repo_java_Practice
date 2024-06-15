package OopsConcept;

import java_Programs.staticBlock;

public class TestInterface {

	public static void main(String args[]) {
		HSBCBank hsbcBank = new HSBCBank();

		hsbcBank.carLoan();
		hsbcBank.credit();
		hsbcBank.debit();
		hsbcBank.educationLoan();
		hsbcBank.transfermoney();
		hsbcBank.mutualFund();
		// dynamic polu===child class object can be reffered by parent refernce var.
		USBank usBank = new HSBCBank();

		usBank.credit();
		usBank.debit();
		usBank.transfermoney();

		
		BrazilBank brazilBank = new HSBCBank();
		
		brazilBank.mutualFund();
	}
}
