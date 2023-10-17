package p6_Scanner_Class;

import java.util.Scanner;

public class Application_Form {
	
	public void m5() {
	
		Scanner sc= new Scanner (System.in);
		System.out.println ("Enter candidate name");
		String name = sc.next();
		System.out.println ("Name : " + name);
		
		System.out.println("Enter Mobile Number ");
		Long mob = sc.nextLong();
		System.out.println ("Contact Number"+mob);
		
		System.out.println ("Enter City Name");
		String city = sc.nextLine();
		System.out.println ("City : " +city);
		
		sc.close();
		
	}
	public static void main (String [] args) {
		Application_Form a = new Application_Form();
		a.m5();
	}

}
