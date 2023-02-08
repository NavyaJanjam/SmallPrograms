package nj.quality.com;

import java.util.Scanner;

public class QualityOfCost {

	/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000. 
	Ask user for quantity Suppose, one unit will cost 100. Judge and print total cost for user.
	*/
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();
		
		if (quantity *100 >1000)
			System.out.println("cost is " +((quantity*100)-(0.1*quantity*100)));
		else
			System.out.println("cost is " +(quantity*100));
		

	}

}
