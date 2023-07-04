package com.assignments;
import java.util.Scanner;
public class Loops17 {

	public static void main(String[] args) {
		int a=2,r=3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int n=sc.nextInt();
		sumofgs(n,a,r);
		// TODO Auto-generated method stub

	}
	static void sumofgs(int n,int a,int r) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=a*(Math.pow(r,i));
			
		}
		System.out.println(sum);
	}

}
