package nj.smallprograms.examples.practice.SmallPrograms;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BufferReaderBankApplication {

	public static void main(String[] args) throws Exception, Exception {

		int	accno = 0;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		NewBankApplication nba = new NewBankApplication();
		BankAccount ba= new BankAccount();

		int  ch ;
		String con;
		do {
			System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Display all account details \n 2. Account Details\n"
            		         + " 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch= Integer.parseInt( br.readLine());
            switch (ch) {
		case 1: 
			System.out.println("Enter the Account");
				accno= Integer.parseInt(br.readLine());
			System.out.println("customer name");
			String cname = br.readLine();
			System.out.println("salary");
			float salary = Float.parseFloat(br.readLine());
			String result1 =  ba.createAccount(nba);
			System.out.println("Result " +result1);
			break;
				
		case 2 : List<NewBankApplication> li= new ArrayList<NewBankApplication>();
		Iterator<NewBankApplication> ii= li.listIterator() ;
		while (ii.hasNext()) {
			NewBankApplication nba1= ii.next();
			System.out.println("Name "+nba1.getCname()+ "account number " +nba1.getAccno()+  " salary " +nba1.getSalary());
		}
		String result =ba.getAccountBalance(accno);		
		System.out.println(" Account Detals "+result);
			break;
		case 3:
			System.out.println("Enter teh account number");
			accno =Integer.parseInt(br.readLine());
		String re1 =	ba.withDrawAmount(accno);
			System.out.println( " with drawing amonut "+re1);
		
			break;
		case 4 :
			
			System.out.println( " enter the  deposit amount ");
		int deposit = Integer.parseInt(br.readLine());
		System.out.println( " Customer name");
	String	cname1= br.readLine();
		String re5=	ba.deposit(deposit, cname1);
			System.out.println( "  " +re5);
			break;
			
			
		case 5 :
			
			System.out.println("see you soon ");
			
			break;
		default:
			System.out.println("wrong choice");
			break;
		} 
            
            
            System.out.println(" Do you want to continue ?");
            
             con = br.readLine();
		    
            System.out.println(" Thank you for choosing the bank");
		}while (con.equals(" Y"));
            
		
	
		
	
		
	}

}
