package com.assignments;

import java.util.Scanner;

public class Loops21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int e=0,o=0;
		do {
			int x=n%10;
			if(x%2==0)
				e+=x;
			else
				o+=x;
			n=n/10;
		}while(n>0);
		System.out.println("The sum of even digits is "+e);
		System.out.println("The sum of odd digits is "+o);
		// TODO Auto-generated method stub

	}

}
