package com.roxyeris.dovelet.s30.q5triangle;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		NumberFormat form = new DecimalFormat("#0.00");
		System.out.println(form.format((a*b/(double)2)));
	}
}
