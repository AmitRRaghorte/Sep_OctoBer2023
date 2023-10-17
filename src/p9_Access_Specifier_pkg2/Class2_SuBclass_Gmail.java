package p9_Access_Specifier_pkg2;

import p9_Access_Specifier_pkg1.Class1_Superclass_Google;

public class Class2_SuBclass_Gmail extends Class1_Superclass_Google{
	
	protected void gmail () {
		System.out.println ("Gmail is Best Product of Google ");
	}
	
	public static void main (String [] args) {
	
		Class2_SuBclass_Gmail g = new Class2_SuBclass_Gmail ();
		g.gmail();
		g.google();
	}
	

}
