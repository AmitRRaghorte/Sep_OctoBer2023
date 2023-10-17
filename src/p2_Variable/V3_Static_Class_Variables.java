package p2_Variable;

public class V3_Static_Class_Variables {
	
	static int x = 100 ;  // static variables
	static int y = 200 ;
	
	public static void m5() {
		int z = x+y;
		System.out.println (z);
		
	}
	public void m6() {
		int z = x-y ;
		System.out.println (z);
		
	}
	public static void main (String [] args) {
		m5(); // Static method
		V3_Static_Class_Variables v = new V3_Static_Class_Variables ();
		v.m6();
	}	

}


// Static variable : Declared inside class but outside method with "Static" keyword
//                   also known as "Class "variables
//                   Accessible throughout class
//                   declared with static and non-static method
//                   default value decided when class loaded into memory