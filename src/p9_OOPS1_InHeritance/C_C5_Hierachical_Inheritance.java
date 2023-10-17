package p9_OOPS1_InHeritance;

public class C_C5_Hierachical_Inheritance {
	
	public static void main (String [] args ) {
		
		C_C2_Hierachical_Inheritance_SuBClass_1 d = new C_C2_Hierachical_Inheritance_SuBClass_1();
		
		d.job();
		d.blog();
		d.rental();
		d.onlinebusiness();
		System.out.println ("**************************");
		
		C_C3_Hierachical_Inheritance_SuBClass_2 e = new C_C3_Hierachical_Inheritance_SuBClass_2();
		e.job();
		e.blog();
		e.phynylbusiness();
		e.saascompany();
		System.out.println ("**************************");
		C_C4_Hierachical_Inheritance_SuBClass_3  f = new C_C4_Hierachical_Inheritance_SuBClass_3 ();
		f.job();
		f.blog();
		f.hotel();
		f.ev();
		System.out.println ("**************************");
	}

}
