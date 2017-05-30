package com.roxyeris.dovelet.s30.q9change;

import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		int a = 1000-sc.nextInt();
		
		int h = a/100;
		int hr = a%100;
		int f = hr/50;
		int fr = hr%50;
		int t = fr/10;
		
		System.out.println(h+" "+f+" "+t);
	}
}
