package nj.absolute.value.com;

import java.util.Scanner;

public class AbsoluteValue {

	/*
	 * Write a program to print absolute value of a number entered by user.
	 *  E.g.- INPUT: 1 
	 *  OUTPUT: 1 
	 *  INPUT: -1 
	 *  OUTPUT: 1
	 */
	
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int number= sc.nextInt();
		
		if(number <0)
			System.out.println("Number is" +(number*-1));
		else
			System.out.println("number is:" +number);

	}

}
