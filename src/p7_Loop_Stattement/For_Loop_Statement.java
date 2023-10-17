package p7_Loop_Stattement;

public class For_Loop_Statement {
	
	// print even no form 50 to 100 
	// starting =50
	// eneding = 100
	// order is incresing so use increment ++
	// as iteration is fixed use for loop
	// even no = divisible by 2 and remainder is zero (a%2==0)
	
	public void m5() {
		
		int a = 50 ;
		int count = 0;
		
		for (a=50;a<=100;a++) {      // another logic : for(a=50;a<=100;a=a+2)
	
			
			count++;
			if (a%2==0) {
			  
			System.out.println (a);
			}
			
		}
		System.out.println ("----------------------"+"\n"+"Total count :" + count);
		
	}
	public static void main (String [] args) {
		 For_Loop_Statement l = new  For_Loop_Statement ();
		 l.m5();
	}

}
