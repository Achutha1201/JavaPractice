//Write a Java program to count the number of even and odd elements in an array
package com.assignments;

public class Arrays07 {

	public static void main(String[] args) {
		int[] a= {3,4,4,6,1,6,2,32,54};
		int e=0,o=0;
		for(int i:a) {
			if(i%2==0)
				e++;
			else
				o++;
			
		}
		System.out.println("The No of even numbers are:"+e);
		System.out.println("The No of odd numbers are:"+o);
		// TODO Auto-generated method stub

	}

}
