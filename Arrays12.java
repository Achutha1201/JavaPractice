// How do you concatenate two arrays in Java?
package com.assignments;

public class Arrays12 {

	public static void main(String[] args) {
		int[] a= {32,5,23,5,76,43,776,43,8};
		int[] b= {43,54,23,76,87,54,87,43,37};
		int x=a.length,y=0;
		int[] c=new int[a.length+b.length];
		for(int i:a) {
			c[y]=i;
			y++;
		}
		for(int i:b) {
			
			c[x]=i;
			//System.out.println(x);
			
			//System.out.println(i);
			x++;
		}
		for(int i:c)
			System.out.println(i);		// TODO Auto-generated method stub

	}

}
