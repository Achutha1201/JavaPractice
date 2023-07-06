//Write a program to check whether a number is even or odd.
package com.assignments;
import java.util.Scanner;
public class Conditions05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		// TODO Auto-generated method stub

	}

}
