package com.assignments;

import java.util.Scanner;
public class Loops20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int i=1;
		int gcd=1;
		do{
			if(a%i==0 && b%i==0)
				gcd=i;
			i++;
		}while(i<=a && i<=b);
		System.out.println("The GCD of "+a+" and "+b+" is "+gcd);
		// TODO Auto-generated method stub

	}

}
