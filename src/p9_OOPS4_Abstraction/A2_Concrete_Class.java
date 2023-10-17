package p9_OOPS4_Abstraction;

public class A2_Concrete_Class extends A1_Abstract_class {
	
	public void welcome () {
		System.out.println ("Welcome To AMR Bank");
	}

	public void name() {
		System.out.println("Amit RRaghorte");

	}

	public void mobno() {
		System.out.println("9175605670");
	}

	public void emailid() {
		System.out.println("amitrraghorte05@gmail.com");
	}

	public void accountno() {
		System.out.println("998877665544");
	}

	public static void main (String [] args ) {
		A2_Concrete_Class  a = new A2_Concrete_Class ();
		a.creditcard();
		a.name();
		a.mobno();
		a.emailid();
		a.accountno();
		a.greeting();
	}

}
