package com.roxyeris.dovelet.s30.q17coci_faktor;

import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		int papers = sc.nextInt();
		int factor = sc.nextInt();
		
		// factor = use/papers -> use = papers*factor
				
		System.out.println(papers*(factor-1)+1);
	}
}
