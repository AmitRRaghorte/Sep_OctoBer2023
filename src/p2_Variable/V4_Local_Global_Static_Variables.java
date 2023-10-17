package p2_Variable;

public class V4_Local_Global_Static_Variables {
	
	static int x = 100;  // Static Variable or class
	int y = 200;         // Globle varibale or instance
	
	public static void m5() {
		int u = 300 ;        // local varibles
		int z = u/x; // 3
		System.out.println (z);
		
	}
	public void m6() {
		int u = 400 ; // local varibles
		int p = u/y; //2
		int r = u-y; //200
		System.out.println (p+"\n"+r);
		
	}
	public static void main (String [] args) {
		V4_Local_Global_Static_Variables t = new V4_Local_Global_Static_Variables ();
		t.m6();
		m5();
	}

}
