//Write a program to check whether a number is negative, positive or zero
package com.assignments;
import java.util.Scanner;

public class Conditions03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();
		if(a>0)
			System.out.println("positive");
		else if(a<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		
		// TODO Auto-generated method stub

	}

}
