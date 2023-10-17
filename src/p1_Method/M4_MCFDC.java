package p1_Method;

public class M4_MCFDC {
	
	public static void main (String [] args) {
		
		M3_MCFSC p = new M3_MCFSC();
		p.m5();        // For calling non-static method of different class
		
		M3_MCFSC.m6(); // For calling Static method of different class
		
	}

}

// Note : 1. classname.methodname(); ==>Used  When we calling static method of 1 class into other class
//  2.create obj of class1  : when you want to call non-static method of class 1 into class 2
