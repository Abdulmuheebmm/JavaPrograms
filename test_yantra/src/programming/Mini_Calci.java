package programming;

import java.util.Scanner;

public class Mini_Calci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:addtion\n2:substraction\n3:division");
		int opt = sc.nextInt();

		System.out.println("enter the value of A");
		int v1 = sc.nextInt();
		System.out.println("enter the value of B");
		int v2 = sc.nextInt();

		switch (opt) {
		case (1): {

			int v3 = v1 + v2;
			System.out.println("sum of a and b is " + v3);
			break;
		}

		case (2): {

			int v3 = v1 - v2;
			System.out.println("substraction of a and b is " + v3);
			break;
		}

		case (3): {

			int v3 = v1 / v2;
			System.out.println("substraction of a and b is " + v3);
			break;
		}

		default: {

			System.out.println("enter valid option");
		}

		}

	}
}
