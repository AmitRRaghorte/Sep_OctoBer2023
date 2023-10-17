package p9_OOPS4_Abstraction;

public class M4_Implementation_Multiple_Inheritance implements M3_Interface {

	
	public void a5() {
		System.out.println ("A5");
		
	}

	
	public void a6() {
		System.out.println ("A6");
		
	}

	
	public void a2() {
		System.out.println ("A2");
		
	}

	
	public void a3() {
		System.out.println ("A3");
	}

	
	public void a7() {
		System.out.println ("A7");
		
	}
	
	public static void main (String [] args) {
		
		M4_Implementation_Multiple_Inheritance v = new M4_Implementation_Multiple_Inheritance ();
		
		M1_Interface.a1();
		v.a2();
		v.a3();
		
		M2_Interface.a4();
		v.a5();
		v.a6();
		
		v.a7();
	}

}
