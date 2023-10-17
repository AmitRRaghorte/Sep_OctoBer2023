package p3_Constructor;

public class ConstructorOverloading {

	


		public ConstructorOverloading (int a){
		System.out.println ("1 args");
		}
		public ConstructorOverloading (String name){
		System.out.println ("2 args");
		}
		public ConstructorOverloading (long mobno ,String add){
		System.out.println ("3 args");
		}
		public static void main (String [] args){

		new ConstructorOverloading (105);
		new ConstructorOverloading ("Amit RRaghorte");
		new ConstructorOverloading (8605091289l ,"Armori");


		}

		}

