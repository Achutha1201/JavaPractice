package com.assignments;
import java.util.Scanner;
public class Loops19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1,b=-3;
		for(int i=1;i<n;i=i+2) {
			System.out.println(a);
			System.out.println(b);
			a+=4;
			b+=-4;
			
			
		}
		if(n%2!=0)
			System.out.println(a);
		// TODO Auto-generated method stub

	}

}
