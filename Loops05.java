package com.assignments;

public class Loops05 {

	public static void main(String[] args) {
		int f=0,s=1,i=3;
		System.out.println(f);
		System.out.println(s);
		while(i<=10) {
			int x=s;
			s=f+s;
			f=x;
			System.out.println(s);
			i++;
			
		}
		
		// TODO Auto-generated method stub

	}

}
