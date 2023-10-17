package p7_Loop_Stattement;

public class While_Loop {
	
	public void m5() {
		int a = 10 ;     // initialisation
		
		while(a<=20) {   // Condition
			System.out.println (a);
			
			a++;        // Increment / Decrement
			
		}
		
		
	}
	public static void main (String [] args) {
		While_Loop  w = new While_Loop ();
		w.m5();
	}

}
