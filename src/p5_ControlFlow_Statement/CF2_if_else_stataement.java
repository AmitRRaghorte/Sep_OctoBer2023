package p5_ControlFlow_Statement;

// Write program to find out given number odd or even
public class CF2_if_else_stataement {
	
	public void m5() {
		int a = 10;
		
		if (a/2==5) {
			System.out.println ("Given no is even no");
		}else {
			System.out.println ("Given no is odd number");
		}
	}
	public static void main (String [] args) {
		CF2_if_else_stataement  c = new CF2_if_else_stataement ();
		c.m5();
	}

}
