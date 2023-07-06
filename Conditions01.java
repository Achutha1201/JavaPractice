//program to find maximum between two numbers (inputs from scanner class)
package com.assignments;
import java.util.Scanner;
public class Conditions01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println("Biggest number is:"+a);
		else
			System.out.println("Biggest number is:"+b);
		
		// TODO Auto-generated method stub

	}

}
