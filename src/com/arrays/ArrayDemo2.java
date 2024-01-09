package com.arrays;

public class ArrayDemo2 {
	static void min(int arr[]) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) 
			if(min>arr[i])
			min = arr[i];
			System.out.println(min);
		
		}
	public static void main(String[] args) {
		int a[] = {100,20,30,40,50};
		min(a);
	}

}
