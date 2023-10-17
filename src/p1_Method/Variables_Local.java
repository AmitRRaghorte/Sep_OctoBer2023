package p1_Method;

public class Variables_Local {
	
	public void m5 () {
	int a = 10 ;
	int b = 20 ;
	int c = b-a ;
	System.out.println (c);
	}
	public static void main (String [] args) {
		Variables_Local k = new Variables_Local ();
		k.m5();
	}

}
