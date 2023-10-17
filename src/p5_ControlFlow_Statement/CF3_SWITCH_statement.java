package p5_ControlFlow_Statement;

public class CF3_SWITCH_statement {
	public void m5 () {
		int month = 10 ;
		
		switch (month) {
		
		case(1):System.out.println("January");break;
		case(2):System.out.println("February");break;
		case(3):System.out.println("March");break;
		case(4):System.out.println("January");break;
		case(10):System.out.println("October");break;
		
		}
	}
		
		public static void main (String [] args) {
			CF3_SWITCH_statement v = new CF3_SWITCH_statement ();
			v.m5();

}
}
