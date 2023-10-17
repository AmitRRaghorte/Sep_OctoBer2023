package p9_OOPS2_Polymorphism;

public class R3_RunTime_Method_Overriding {
	
	public static void main (String [] args) {
		
		R1_RunTime_Superclass_Override  r = new R1_RunTime_Superclass_Override  ();
		
		r.car();  // Original properties
		r.bike(); // Original properties
		
	   R2_RunTime_Subclass_Override m = new  R2_RunTime_Subclass_Override ();
	   
	   m.car();   //Updated Properties
	   m.bike();  //Updated Properties
	}
}

