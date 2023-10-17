package p9_OOPS2_Polymorphism;

public class CompileTime_Method_Overloading {
	
	public void fun ()    // // Mehtod Declaration
	{                                 
		System.out.println ("Mehtod with zero Parameter");   // Method Defination
	}
	public void fun (int a) {
		System.out.println ("Mehtod with Int parameter Parameter : " +a);
	}
	public void fun (String name) {
		System.out.println ("Mehtod with diff Parameter : " + name);
	}
	
	public static void main (String [] args) {
		
		CompileTime_Method_Overloading m = new CompileTime_Method_Overloading ();
		m.fun();
		m.fun(10);
		m.fun("Amit");
	}

}
// Mehtod Overloading : same method with diff.para within class
