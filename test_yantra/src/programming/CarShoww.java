package programming;

import java.util.Scanner;

public class CarShoww {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE INTRESTED CAR NAME kia/kwid/fortuner");
		String s = sc.nextLine();

		switch (s) {

		case ("kia"): {
			System.out.println("car name kia\nmodel 123\ncolor black\nprice 700000");
			break;
		}

		case ("kwid"): {
			System.out.println("car name kwid\nmodel kwd1234\ncolor white\nprice 40000");
			break;
		}

		case ("fortuner"): {
			System.out.println("car name fortuner\nmodel for134\ncolor white\nprice 1700000");
			break;
		}
		default: {
			System.out.println("enter correct name of car");
		}

		}

	}
}
