package Interface_Practice;

public class TestBank {
	public static void main(String args[]) {

		HSBC_bank hs = new HSBC_bank();

		hs.credit();
		hs.debit();
		hs.education_loan();
		hs.transfermoney();
		hs.carLoan();

		// dynamic polymorphism

		USbank ub = new HSBC_bank();
		ub.credit();
		ub.debit();
		ub.transfermoney();
		System.out.println(USbank.minbal);
	}
}
