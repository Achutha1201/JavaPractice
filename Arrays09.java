//Check if an element exists in an array in Java?
package com.assignments;
import java.util.Scanner;

public class Arrays09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] a= {34,5,2,5,23,6,886,45,6,776,543,43,65,5,6,323,54};
		System.out.println("Enter number to search:");
		int f=sc.nextInt();
		int j=0;
		for(int i:a) {
			if(i==f) {
				System.out.println("It exists in this array");
				j++;
				break;
			}
		}
		if(j==0)
			System.out.println("Element not found");
		// TODO Auto-generated method stub

	}

}
