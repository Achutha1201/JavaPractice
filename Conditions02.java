// Write a program to find maximum between three numbers. (inputs from scannerclass).
package com.assignments;

import java.util.Scanner;

public class Conditions02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
			if(a>c)
				System.out.println("Biggest number is:"+a);
			else
				System.out.println("Biggest number is:"+c);
		else if(b>c)
			System.out.println("Biggest number is:"+b);
		else
			System.out.println("Biggest number is:"+c);
		// TODO Auto-generated method stub

	}

}
