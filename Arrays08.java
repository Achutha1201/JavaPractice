//Find the maximum value in an array in Java?
package com.assignments;

public class Arrays08 {

	public static void main(String[] args) {
		int[] a= {3,54,2,6,1,9,45,8,3,34,76,32};
		int max=0;
		for(int i:a) {
			if(i>max)
				max=i;
		}
		System.out.println("The Maximum number in the array is:"+max);
		// TODO Auto-generated method stub

	}

}
