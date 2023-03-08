package programming;

import java.util.Scanner;

public class Shopping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE SIZE OF SHIRT 28/32/34");
		int s = sc.nextInt();

		switch (s) {

		case (28): {
			System.out.println("SMALL SIZE");
			break;
		}

		case (32): {
			System.out.println("meadium size");
			break;
		}

		case (34): {
			System.out.println("larg size");
			break;
		}
		default: {
			System.out.println("enter valid size");
		}

		}
	}
}
