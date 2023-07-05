//Write a Java program to find the average of all elements in an array
package com.assignments;

public class Arrays06 {

	public static void main(String[] args) {
		int[] a= {3,2,5,3,76,6};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
			
		}
		double avg=(double)sum/a.length;
		System.out.println("The Average is "+avg);
		
		// TODO Auto-generated method stub

	}

}
