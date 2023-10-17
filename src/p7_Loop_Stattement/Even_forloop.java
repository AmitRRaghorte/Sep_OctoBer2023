package p7_Loop_Stattement;

public class Even_forloop { // print even number from 50 to 100

	public static void main (String [] args) {
		
		int a = 50 ;
		int count  = 0;
		
		for (a=50;a<=100;a=a+2) {
			count++;
			System.out.println (a);
		}
		System.out.println ("Total Number Count : " +a);
		
	}
}
