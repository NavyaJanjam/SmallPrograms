package nj.age.com;

import java.util.Scanner;

public class DecideAge {

	//Take input of age of 3 people by user and determine oldest and youngest among them.
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first person age");
		int first_person = sc.nextInt();
		System.out.println("Enter the second person age");
		int second_person = sc.nextInt();
		System.out.println("Enter the Third person age");
		int third_person = sc.nextInt();
		
		if(first_person >= second_person && first_person >= third_person )
			System.out.println(" Oldest Age of the Person " +first_person);
		else if(second_person >= first_person && second_person >= third_person )
			System.out.println(" Oldest Age of the Person " +second_person);
		else if(third_person>= second_person && third_person >= first_person )
			System.out.println(" Oldest Age of the Person " +third_person);
		else
			System.out.println(" All are in the same age ");
		
		
	}

}
