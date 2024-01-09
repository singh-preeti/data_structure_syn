package com.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int b[]={10,20,30};
		//declaration and instantiation
		int a[] = new int[5];
		a[0] = 10; //initialization
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//try for character
		
		//traversing the array
//		for(int i =0;i<b.length;i++)
//		System.out.println(b[i]);
		
		for(int i:b)
			System.out.println(i);
		
	}
}
