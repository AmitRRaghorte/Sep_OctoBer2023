package p4_Operator;

public class O1_Logicaland_BitwiseAND {

	public void m5() {
		int a = 10;
		int b = 5;
		int c = 30;
		int d = 50;
		System.out.println(a > b && d > c); // T + T = T -- Logical AND
		System.out.println(a > b && d < c); // T + F = F

		System.out.println(a > b || d > c); // T +T = T -- Logical OR
		System.out.println(a > b || d < c); // T + F = T

		System.out.println(a > b & d > c); // T + T = T -- BitWise And
		System.out.println(a > b & d < c); // T + F = F --

		System.out.println(a > b | d > c); // T +T = T --Bitwise OR
		System.out.println(a > b | d < c); // T + F = T

	}

	public static void main(String[] args) {
		O1_Logicaland_BitwiseAND l = new O1_Logicaland_BitwiseAND();
		l.m5();
	}
}
