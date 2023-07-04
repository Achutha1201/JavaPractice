package com.assignments;
import java.util.Scanner;

public class Loops09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to verify:");
		int n=sc.nextInt();
		int p=0;
		for(int i=1;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				System.out.println("Not a prime");
				p++;
				break;
			}
		}
		if(p==0)
			System.out.println("It is a prime");
		// TODO Auto-generated method stub

	}

}
