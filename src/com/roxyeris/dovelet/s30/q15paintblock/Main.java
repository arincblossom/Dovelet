package com.roxyeris.dovelet.s30.q15paintblock;

import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 2*2*2=0, 2*3*2=4, 2*3*3=8, 3*3*3=12
		
		System.out.println((a-2)*4+(b-2)*4+(c-2)*4);
	}
}
