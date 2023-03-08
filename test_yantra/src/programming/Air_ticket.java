package programming;

import java.util.Scanner;

public class Air_ticket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER CHOICE\n 1:BUSINESS CLASS\n 2:ECONOMICAL CLASS\n 3:LUXUARY CLASS");
		int c = sc.nextInt();

		switch (c) {

		case (1): {
			System.out.println("YOUR CHOICE IS BUSINESS");
			break;
		}

		case (2): {
			System.out.println("YOUR CHOICE IS ECONOMICAL CLASS ");
			break;
		}

		case (3): {
			System.out.println("YOUR CHOICE IS luxuary CLASS ");
			break;
		}

		default: {
			System.out.println("enter valid option");
		}

		}
	}
}
