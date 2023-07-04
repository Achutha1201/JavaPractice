package com.assignments;

import java.util.Scanner;

public class Loops16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int x=s.length();
		int n=Integer.parseInt(s);
		arm(n,x);
	}
	public static void arm(int a,int b) {
		int ar=0;
		for(int i=a;i>0;i=i/10) {
			int x=i%10;
			ar+=Math.pow(x, b);
			
		}
		if(ar==a)
			System.out.println("Armstrong");
		else
			System.out.println("Not a Armstrong");
		
	}

}
