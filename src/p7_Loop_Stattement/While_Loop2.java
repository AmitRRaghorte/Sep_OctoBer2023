package p7_Loop_Stattement;

public class While_Loop2 {

	public static void main(String[] args) {

		int a = 10;

		while (a <= 30) {

			if (a % 2 != 0) {
				System.out.println("Odd number : "+a);
			}
			System.out.println (a);
			a++;
		}

	}
}
