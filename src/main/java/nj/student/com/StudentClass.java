package nj.student.com;

import java.util.Scanner;

public class StudentClass {

	/*
	 * A student will not be allowed to sit in exam if his/her attendence is less than 75%. 
	 * Take following input from user Number of classes held Number of classes attended. 
	 * And print percentage of class attended Is student is allowed to sit in exam or not.
	 */
	
	public static void main(String[] args) {

	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of classes held");
		int Number_of_classes_held = sc.nextInt();
		
		System.out.println("Enter Number of classes attended");
		int Number_of_classes_attended = sc.nextInt();

		int attendend =(Number_of_classes_attended/(Number_of_classes_held))*100;
		System.out.println("Attendence is " +attendend);
		if(attendend >= 75)
			System.out.println("you are allow to sit in the exam");
		else 
			System.out.println("you are not sit in the exam ");
		
	}

}
