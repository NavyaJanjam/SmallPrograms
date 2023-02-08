package nj.bounce.com;

import java.util.Scanner;

public class BounceAmount {

	/*.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. 
	 * Ask user for their salary and year of service and print the net bonus amount.
	  */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the Salary : ");
		int salary = sc.nextInt();
		System.out.println(" Enter the YearOfServices ");
		int year_of_service = sc.nextInt();
		
		if(year_of_service > 5)
			System.out.println("Bonus is incresase 5%  : ----" +(0.05 *salary));
		else 
			System.out.println(" No Bounce ");
			
		
		
	}

}
