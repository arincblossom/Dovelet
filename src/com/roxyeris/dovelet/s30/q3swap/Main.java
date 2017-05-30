package com.roxyeris.dovelet.s30.q3swap;

import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] arr = {a, b};
		swap(arr);
		
		System.out.println(arr[0]+" "+arr[1]);
	}
	
	private static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
}
