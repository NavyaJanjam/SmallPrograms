package nj.smallprograms.examples.practice.SmallPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.security.auth.login.AccountException;

public class BankAccount {

	List<NewBankApplication> listOfAccount = new ArrayList<NewBankApplication>();
	
	public String createAccount(NewBankApplication account) {
		if(listOfAccount.size()==0 ) {
			listOfAccount.add(account);
			return " Account can be created";
		}else {
			Iterator <NewBankApplication> ii = listOfAccount.iterator();
			int flag=0;
			while(ii.hasNext()) {
				NewBankApplication acc = ii.next();
				if(acc.getAccno() == account.getAccno()) {
					flag++;
					break;
				}
				}
				
			}
		
		int flag =0;
		if(flag >0) {
			return "Account can't be unique";
		}else {
			listOfAccount.add(account);
			flag=0;
			return "Account created successfully";
		
		}
	}
	
	public String getAccountBalance (int accno) {
	
		NewBankApplication myAcc = null;
		Iterator <NewBankApplication> ii = listOfAccount.iterator();
		int flag=0;
		while(ii.hasNext()) {
			NewBankApplication acc = ii.next();
			if(acc.getAccno() == accno) {
				}
		}
				
		if(myAcc== null) {
			return " There is no account details " +accno;
		}else {
			
			return "My account balance is  " +myAcc.getAccno();
		}
		
	}
	
	public String withDrawAmount ( int accno) {
	
		int withdraw = 5000 ;
		
	int amount = 20000;
	System.out.println( "with draw the amount " +withdraw );
	int amount1= amount-withdraw;
	System.out.println("after withdrwaing " +amount1 );
	
	if(amount >= amount1) {
		
      return  " After With drawing " +amount;
	}else {
		return " your bank balance is less" +amount+ " Teransation failed"  ;

	}
	
		
	}
	public String deposit (int deposit,String name) {
		int amount1 = 1000;
		System.out.println(name + " deposited amount " +deposit);
		
		int amount11 = amount1 +deposit;
		return " After Deposit "+amount11;
		
	}

	
	
	
	
	
	
}
