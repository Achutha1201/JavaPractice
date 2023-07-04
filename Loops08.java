package com.assignments;
import java.util.Scanner;
public class Loops08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int sum=0;
		while(n>=10) {
			int x=n%10;
			sum+=x;
			n=n/10;
			
		}
		sum+=n;
		System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
