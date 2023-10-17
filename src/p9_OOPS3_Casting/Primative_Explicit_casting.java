package p9_OOPS3_Casting;

public class Primative_Explicit_casting { // Higher Datatype into Lower Datatype
	
	public void m5() {
		int a = 10000;
		short b = (short)a;
		System.out.println (b);
	}
	public static void main (String [] args) {
		Primative_Explicit_casting v = new Primative_Explicit_casting ();
		v.m5();
	}

}
