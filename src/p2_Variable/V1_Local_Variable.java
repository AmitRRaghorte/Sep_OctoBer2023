package p2_Variable;



public class V1_Local_Variable {
	
		
		public void m5 () {           // Non-Static method
		int a = 10 ;                 // Local variables 
		int b = 20 ;
		int c = b-a ;
		System.out.println (c);
		}
		public static void m6() {   // Static method
		int a = 10;
		int b = 20 ;
		int c = a*b;
		System.out.println (c);
		}
		
		public static void main (String [] args) {
			V1_Local_Variable	k = new V1_Local_Variable ();
			k.m5();
			m6();
		}

	}

// Local VARIABLES : temporary 
//                   declared inside method ,
//                   cant use same local variable within method 
//                   doesnt have default value

