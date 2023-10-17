package p1_Method;

public class M2_Method_Overloading_with_Diff_args {

	public static void copy(int a) {
		System.out.println("Number :" + a);
	}

	public static void copy(String name) {
		System.out.println("Name :" + name);
	}

	public static void main(String[] args) {
		copy(108);
		copy("Amit RRaghorte");

	}
}

// Method Overloading by provding diff. ARGS