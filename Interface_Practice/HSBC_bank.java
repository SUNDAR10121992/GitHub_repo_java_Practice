package Interface_Practice;

public class HSBC_bank implements USbank, Brazil_Bank {//Acheinving multiple inheritance 
	

	// If a class implementing any interface its mandatory to define/overrride all
	// the methodes of interface

	public void credit() {
		System.out.println("hsbc ----credit");

	}

	public void debit() {
		System.out.println("hsbc ---debit ");
	}

	public void transfermoney() {
		// TODO Auto-generated method stub
		System.out.println("hsbc ---transfer mony");

	}

	// Seperate methodes of hsbc

	public void education_loan() {
		System.out.println("edu--loan ");

	}

	public void carLoan() {
		System.out.println("Hsbc------carloan ");
	}

//be=razil bank methodes ; that is override methode from brazil bank 

	@Override
	public void mutualfund() {
		// TODO Auto-generated method stub
		System.out.println("Hsbc ====Mutual fund");

	}

}
