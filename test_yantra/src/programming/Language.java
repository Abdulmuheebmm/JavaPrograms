package programming;

import java.util.Scanner;

public class Language {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("COOSE LANGUAGE\n 1: KANNADA\n 2: ENGLISH\n 3:HINDI");
		int l = sc.nextInt();

		switch (l) {

		case (1): {
			System.out.println("you choose kannada as your first language all the best");
			break;
		}
		case (2): {
			System.out.println("you choose englis as your first language all the best");
			break;
		}

		case (3): {
			System.out.println("you choose hindi as your first language all the best");
			break;
		}

		default: {
			System.out.println("enter valid option");
		}

		}
	}
}
