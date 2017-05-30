package com.roxyeris.dovelet.s30.q10sec;

import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int sec = a%60;
		a -= sec;
		int min = a/60%60;
		a -= min*60;
		int hr = a/60/60%24;
		a -= hr*24*60;
		int day = a/60/60/24;
		
		System.out.println(day+" "+hr+" "+min+" "+sec);
	}
}
