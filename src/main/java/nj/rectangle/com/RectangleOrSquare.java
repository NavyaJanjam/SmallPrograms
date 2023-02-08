package nj.rectangle.com;

import java.util.Scanner;

public class RectangleOrSquare {

	
	//1.Take values of length and breadth of a rectangle from user and check if it is square or not. 
	//(Take values from user means from console using Scanner class)
	
	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the length value:- ");
		int length= sc.nextInt();
		System.out.println(" Enter the breadth value:- ");
		
		int breadth= sc.nextInt();
		
		if(length == breadth)
			System.out.println("It is a square");
		else
			System.out.println("It is a rectangle");
			
	}

}
