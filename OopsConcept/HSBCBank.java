package OopsConcept;

public class HSBCBank implements USBank , BrazilBank {

	public void credit() {
		System.out.println("Credit --Hsbc");
	}

	public void debit() {
		System.out.println("debit--hsbc");
	}

	public void transfermoney() {
		System.out.println("tranfor monry --hsbc");
	}

	void educationLoan() {
		System.out.println("hsbc --edu loan");
	}

	void carLoan() {
		System.out.println("car loan---hsbc");
	}

	@Override
	public void mutualFund() {
		System.out.println("Mutual---hsbc");		
	}

}
