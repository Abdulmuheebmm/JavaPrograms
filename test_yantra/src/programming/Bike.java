package programming;

import java.util.Scanner;

public class Bike {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE MONEY");
		int m = sc.nextInt();

		if (m > 60000) {

			System.out.println("ENTER NO OF BIKES");
			int b = sc.nextInt();

			if (b == 1) {
				System.out.println("MONEY IS SUFFICENT TO BUY A BIKE");
			} else {
				System.out.println("no sufficient");
			}
		}

		else {
			System.out.println("take a loan from bank");
		}

	}
}
