//Write a program to check whether a number is divisible by 4 and 100 or not
package com.assignments;
import java.util.Scanner;
public class Conditions04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		if(n%4==0 && n%100==0)
			System.out.println("It is divisible by both");
		else
			System.out.println("It is not divisible by both");
		// TODO Auto-generated method stub

	}

}
