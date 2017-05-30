package com.roxyeris.dovelet.s30.q12koi_watch;

import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		int hr = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		int psec = sc.nextInt();
		
		int time = 3600*hr + 60*min + sec + psec;
		
		int fhr = time/3600%24;
		
		System.out.println(fhr+" "+time%3600/60+" "+time%3600%60);
	}
}
