package com.assignments;
import java.util.Scanner;
public class Loops14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sumofsquares(n);
		
	}
	static void sumofsquares(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum+=(i*i);
		}
		System.out.println(sum);
	}

}
