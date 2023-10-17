package p2_Variable;

public class V5_This_Keyword_VariableOverloading {

	String name1 = "Amit"; // Global Variables
	String name2 = "Anvisha";
	
	public void check () {
		String name1 = "Isha";
		String name2 = "AUM";
		System.out.println (name1 +"\n"+name2);
		System.out.println (this.name1); //without this statement only local variable executed
		System.out.println (this.name2); //
	}
	public static void main (String [] args) {
		
		V5_This_Keyword_VariableOverloading v = new V5_This_Keyword_VariableOverloading();
		v.check();
	}

}
// NutShell : 1.This is reference keyword which refer current obj of method
//            2.Eliminate confusinon between "class Attributes " & arguments
//            3.Invoke current class method and constructor
//            4.can passed as args in method and constructor call
//            5.Help to access Global variable,Locally
