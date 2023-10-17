package p5_ControlFlow_Statement;

// Print hello if number less than 0 and print invalid if no
public class CF1_IF_Statement {
	
	public void m5() {
		
		int a = 5 ;
		if(a<0) {
		System.out.println ("hello");	
		}
		System.out.println ("Invalid no");
	}
	public static void main (String [] args) {
		
		CF1_IF_Statement c = new CF1_IF_Statement ();
		c.m5();
	}

}
