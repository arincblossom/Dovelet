package com.roxyeris.dovelet.s30.q14fuse;

import java.util.Scanner;

public class Main {
	public static void main(String argc[]) {
		float com = 1.5f;
		float mon = 1f;
		float prn = 2f;
		float rou = 0.5f;
		
		Scanner sc = new Scanner(System.in);
		int comnum = sc.nextInt();
		int prnnum = sc.nextInt();
		int rounum = sc.nextInt();
		
		float fuse = (comnum*(com+mon)+prnnum*prn+rounum*rou)*2;
		int fusec = 0;
		if(fuse%10 != 0) {
			fusec = (int)(fuse/10+1)*10;
		}
		else
			fusec = (int)fuse;
		
		System.out.println(fusec+" amperes");
	}
}
