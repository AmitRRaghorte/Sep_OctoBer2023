package string_Class;

public class Sample_1 {

	public static void main(String[] args) {

		String s1; // Only Declaration + 1obj created

		String s2 = "abcdhgjjkkfp"; // Declaration & Initialisation + 1 obj created
		System.out.println (s2);
		
		String s3 ="abC"; // obj created 
		System.out.println (s3);
		
		s3 =s3+"xy";
		System.out.println (s3); // here obj created but this obj is diff.from s3 obj.in this case old obj.of s3 is deleted and this new obj is used

	}

}
