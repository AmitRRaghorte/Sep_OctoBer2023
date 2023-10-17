package p9_OOPS4_Abstraction;

public abstract class A1_Abstract_class {

	public void creditcard() {
		System.out.println("*******Welcome To AMR_Bank********"); // complete Method
	}

	abstract public void name(); // Incomplete Method

	abstract public void mobno();

	abstract public void emailid();

	abstract public void accountno();

	public void greeting() {
		System.out.println("******Thank you ,Visit Again*******");
	}
}

// Abstarct class declared with abstract keyword
// abstarct class = Abstract + Non-abstract method (i.e incomplete + complete method)
// can not crete the object of abstract class as it contain abstarct method 
// also constructor not able to identify abstract method to it show compile error
// We used concrete class to providing defination to  abstract method of abstrcat class 
// we perform inheritance between abstract and concrete class.
