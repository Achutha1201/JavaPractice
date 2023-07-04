package com.assignments;
import java.util.Scanner;

public class Loops12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		reversenum(n);
		// TODO Auto-generated method stub

	}
	static void reversenum(int a) {
		String rev="";
		while(a>=10) {
			int x=a%10;
			rev+=x;
			a=a/10;
		}
		rev+=a;
		System.out.println(rev);
	}

}
