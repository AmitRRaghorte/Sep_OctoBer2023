package string_Class;

public class Sample_5 { // Print every word separatelty ,print total number of word

	public static void main(String[] args) {
		// Spilt the sentence
		// we got 4 string which we can not store in 1 variable
		// so we used String array to store same kind of info

		String s1 = "my name is Amit";

		String[] ar = s1.split(" "); // (my()0 name(1) is(2) Amit(3))

		// print length
		System.out.println(ar.length);

		System.out.println ("*********");
		// index print character
		System.out.println(ar[1]);
		
		// Print all word separately
		
		System.out.println ("*********");
		
		for (int i=0 ;i<=3;i++) {
			System.out.println (ar[i]);	
		}

	}
}
