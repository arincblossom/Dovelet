package com.roxyeris.dovelet.s30.q11three;

import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int b1 = b%10;
		int b2 = b%100-b1;
		int b3 = b/100;
		
		System.out.println(a*b1);
		System.out.println(a*b2/10);
		System.out.println(a*b3);
		System.out.println(a*b);
	}
}
