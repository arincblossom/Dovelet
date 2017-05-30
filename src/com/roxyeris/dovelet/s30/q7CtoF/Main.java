package com.roxyeris.dovelet.s30.q7CtoF;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		NumberFormat form = new DecimalFormat("#0.0");
		System.out.println(form.format((double)a*9/5+32));
	}
}
