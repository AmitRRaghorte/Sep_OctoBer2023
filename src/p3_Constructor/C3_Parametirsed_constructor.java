package p3_Constructor;

public class C3_Parametirsed_constructor { // Construction overloading
	
	
	public C3_Parametirsed_constructor (){
		System.out.println ("0 args");
	}
	public C3_Parametirsed_constructor(String name){
		System.out.println ("1 args");
		
	}
	public C3_Parametirsed_constructor(String name,int id){
		System.out.println ("2 args");
		
	}
	public C3_Parametirsed_constructor(String name ,int id ,char c){
		System.out.println ("3 args");
		
	}
	public static void main (String [] args) {
		new C3_Parametirsed_constructor ();
		new C3_Parametirsed_constructor("Amit");
		new C3_Parametirsed_constructor("Isha",005);
		//new C3_Parametirsed_constructor("Sadhguru","108",'');
		
	}
	
}
