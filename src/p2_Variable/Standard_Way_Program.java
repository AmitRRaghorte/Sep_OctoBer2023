package p2_Variable;

public class Standard_Way_Program {
	
	int a ;   // Declaration
	int b ;   // Declaration
	int c ;
	
	public void call1() {
		a = 100;
		b = 500 ;
		c = b/a; // 5
		System.out.println (c);
		System.out.println (b-a);//400
	}
	public void call2 () {
		a = 200 ;
		b = 1000 ;
		int c = b/a; // 5
		System.out.println (c);
		System.out.println (b-a);//800
		
	}
	public static void main (String [] args){
		Standard_Way_Program  k = new Standard_Way_Program  ();
		k.call1();
		k.call2();
	}
	

}

// Standard way of program : 1.Declaration : here datatype and variables only declared after class body outside method .eg. int a ;
// 2.Initialisation :here we provide value to variables eg. a = 20 ;
// 3. Usage : here we declared main method and call other method
