package p9_OOPS4_Abstraction;

public class I2_Implimentation_class implements I1_Interface_class {

	public void a1() {
		System.out.println("Interface : 100% non-static abstract method + complete static method");

	}

	public void a2() {
		System.out.println("Used implementation class to define the abstarct method ");

	}

	public void a3() {
		System.out.println("Inheritance between interfce and implementation");

	}

	public static void main (String [] args) {
		I2_Implimentation_class  a = new I2_Implimentation_class ();
		    
		    I1_Interface_class .m5();
			a.a1();
		    a.a2();
		    a.a3();
		   
		
		
	}

}
