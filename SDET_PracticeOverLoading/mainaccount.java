package SDET_PracticeOverLoading;

public class mainaccount {
	public static void main(String args[])
	{
		account_encapsulation acc=new account_encapsulation();
		
		acc.setName("sundar");
		acc.setAmount(1222);
		acc.setAccno(1234);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getAmount());
		System.out.println(acc.getName());
		
	}
}
