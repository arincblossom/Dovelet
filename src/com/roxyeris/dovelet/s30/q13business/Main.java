package com.roxyeris.dovelet.s30.q13business;

import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		int pr = sc.nextInt();
		int pr2 = sc.nextInt();
		int fake = sc.nextInt();
		int ret = sc.nextInt();
		
		int given = pr2+ret;
		int expectedEarn = pr2-pr;
		int realEarn = fake-expectedEarn;
		
		System.out.println(realEarn);
	}
}
