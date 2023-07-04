package com.assignments;
import java.util.Scanner;

public class Loops06 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int f=1;
		for(int i=n;i>=1;i--) {
			f*=i;
		}
		System.out.println(f);
		// TODO Auto-generated method stub

	}

}
