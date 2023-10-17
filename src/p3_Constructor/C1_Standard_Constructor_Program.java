package p3_Constructor;

public class C1_Standard_Constructor_Program {

	String name; // 1.Variable Declration
	String education;
	int age;
	long mobno;
	long aadharno;

	public C1_Standard_Constructor_Program() { // Constructor

		name = "Amit RRaghorte"; // 2.Initialisation of Data member / Variables
		education = "MBA";
		age = 30;
		mobno = 8605091289l;
		aadharno = 6200324090l;

	}

	public void print() { // 3.Load method in obj
		System.out.println(name + "\n" + education + "\n" + age + "\n" + mobno + "\n" + aadharno);
	}

	public static void main(String[] args) {
		C1_Standard_Constructor_Program k = new C1_Standard_Constructor_Program();
		k.print();
	}

}
