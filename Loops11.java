package com.assignments;
import java.util.Scanner;
public class Loops11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int b=sc.nextInt();
		int s=sc.nextInt();
		int gcd=1;
		for(int i=1;i<b && i<s;i++) {
			if(b%i==0 && s%i==0)
				gcd=i;
		}
		System.out.println("GCD is: "+gcd);
		// TODO Auto-generated method stub

	}

}
