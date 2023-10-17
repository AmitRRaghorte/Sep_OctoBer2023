package p2_Variable;

public class V2_Global_Instance_variable {
	
	int a = 10 ; // Globle variable
	
	public void m5() { // only non-static method
    int b = 20 ;
    int c = a*b; // 200
    int d = a/b ; // 0.5
	System.out.println (c+"\n"+d);
		
	}
	public void m6() {
	int e = 200 ;
	int f = e/a ; // 20
	System.out.println (f);
		
	}
	public static void main (String [] args) {
		 V2_Global_Instance_variable  g = new  V2_Global_Instance_variable ();
		 g.m5();
		 g.m6();
	}
	
}

     // Globle variable : Declared inside class but ouside method.
     // got default value based on information
     // accesible throughtout class
     // only declared with "Static method"