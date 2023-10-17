package p3_Constructor;

public class C2_Zero_Aurgument_Constructor {

	public C2_Zero_Aurgument_Constructor() {
		System.out.println("Zero argument Constructor");
	}

	public static void main(String[] args) {
		new C2_Zero_Aurgument_Constructor();
	}

}

// Note : there are 2 ways to call constructor 
//      1. When object of class created .consturctor automatically called for once
//      2.by adding "new" keyword with constructor name follwed by semicolon and ;.