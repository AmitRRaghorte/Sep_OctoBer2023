package p6_Scanner_Class;

import java.util.Scanner;

public class User_input {

	public void m5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Candidate Name  : " + name);

	}

	public static void main(String[] args) {
		User_input v = new User_input();
		v.m5();
	}
}
