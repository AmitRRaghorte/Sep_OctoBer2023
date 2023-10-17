package p6_Scanner_Class;

import java.util.Scanner;

public class Number__Even_odd {

	public void m5() {
		
		Scanner s = new Scanner (System.in);
		System.out.println ("Enter Number");
		int num = s.nextInt();
		System.out.println (num);
		
		if (num%2==0) {
			System.out.println ("Given Number is Even");
		}else {
			System.out.println ("Given Number is odd");
		}

	}

	public static void main(String[] args) {
		Number__Even_odd n = new Number__Even_odd();
		n.m5();

	}
}
