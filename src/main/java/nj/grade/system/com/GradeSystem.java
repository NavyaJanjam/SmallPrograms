package nj.grade.system.com;

import java.util.Scanner;

public class GradeSystem {

	/*
	 * A school has following rules for grading system: 
	 * a. Below 25 - F 
	 * b. 25 to 45 - E 
	 * c. 45 to 50 - D 
	 * d. 50 to 60 - C 
	 * e. 60 to 80 - B
	 * f. Above 80 - A Ask user to enter marks and print the corresponding grade. 
	 * (Write this program using switch case and if-else-if ladder) 
	 * */

	
	public static void main(String[] args) {

	/*	Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
		
		// If-else-if ladder
		
		if(marks < 25)
			System.out.println("F");
		
		else if(marks>=25 && marks <45)
			System.out.println("E");

		else if(marks>=45 && marks <50)
			System.out.println("D");

		else if(marks>=50 && marks <60)
			System.out.println("C");

		else if(marks>=60 && marks <80)
			System.out.println("B");
		else
			System.out.println("A");
		
*/
		// Using the Switch Case
		
		int marks=88;
		String grade =null;		
	
		  
	      switch(marks/10) {
	        // if >= 80
	        case 10:
	        case 9:
	           grade = "A";
	           break;
	        // else if >= 60 and <80
	        case 8:
	           grade = "B";
	           break;
	        // else if >= 50 and <60
	        case 7:
	           grade = "C";
	           break;
	        // else if >= 45 and <50
	        case 6:
	           grade = "D";
	           break;
	        // else if >= 25 and <45
	        case 5:
	           grade = "E";
	           break;
	        // else < 25
	        default:
	           grade = "F";
	           break;
	      }
	      
	      // display grade
	      System.out.println("Grade = " + grade);
	   }
		
		
		
		
	}


