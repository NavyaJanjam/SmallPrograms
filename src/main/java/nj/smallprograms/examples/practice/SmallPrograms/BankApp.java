package nj.smallprograms.examples.practice.SmallPrograms;

public class BankApp {

	public static void main(String[] args) {
		
		NewBankApplication nba = new NewBankApplication();
		nba.setAccno(123);
		nba.setCname(" Navya");
		nba.setSalary(12323);
		
		NewBankApplication nba1 = new NewBankApplication(101, " msajnjsa", 123423);
		
		BankAccount ba = new BankAccount();
	String result5 =	ba.createAccount(nba1);
	String re=	ba.deposit(10000, "Anucjs");
	
	System.out.println(" create account " +result5 );
	System.out.println("deposit amount " +re);
	
//System.out.println(" with draw amonut " +	ba.withDrawAmount(nba));
	
	String result1= ba.createAccount(nba1);
		System.out.println("result " +result1);
		
		String result2= ba.createAccount(nba);
		System.out.println("result " +result2);
	String result =	ba.getAccountBalance(771);
	System.out.println("result " +result);
		
	}

}
