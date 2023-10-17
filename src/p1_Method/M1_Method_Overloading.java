package p1_Method;

public class M1_Method_Overloading {

	public static void display(String name) {
		System.out.println("Name :" + name);

	}

	public static void display(String middle, String Surname) {
		System.out.println("Middle Name : " + middle + "\n" + "Surname :" + Surname);
	}

	public static void main(String[] args) {
		display("Amit");
		display("Madhukar", "RRaghorte");
	}

}

// Note : Method overloading by changing the no. of args