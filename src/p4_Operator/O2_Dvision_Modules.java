package p4_Operator;

public class O2_Dvision_Modules {
	
	public void m5 () {
		
		int a = 10 ;
		int b = 20 ;
		int c = 50;
		int d = 100 ;
		System.out.println (a%b); // 10
		System.out.println (b%a); //0
		System.out.println (a/b); //0
		System.out.println (b/a); //2
		
		System.out.println (a<b && c<d); // T
		System.out.println (a<b ||c<d); // T
		System.out.println (a>b && c>d);  //F
		System.out.println (a<b ||c>d );  //T
		
		System.out.println (a<b & c<d);  // T
		System.out.println (a<b |c<d);   // T
		System.out.println (a>b & c>d);  //F
		System.out.println (a<b |c>d);   //T
		
	}
	
	public static void main (String [] args) {
		O2_Dvision_Modules k = new O2_Dvision_Modules ();
		k.m5();
		
	}

}
