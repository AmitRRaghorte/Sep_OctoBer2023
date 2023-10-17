package string_Class;

public class Sample_3 {
	
	public static void main (String [] args) {
		
		String s1 ="xyz"; 
		String s2 = "xyz";
		String s3= "abc";
		
		String s4 = new String ("def");
		String s5 = new String ("def"); 
		
		 // different obj created in non-constant pool area for s4 and s5
		// Though both variable stored same info with there obj is created with new keyword so 2 diff.obj created for s4 & s5
		
	}

}


// If if are storing same information with with diff.variable 
// then for that information 2 diff.obj didnt created
// it will assigned 2nd info to same obj.