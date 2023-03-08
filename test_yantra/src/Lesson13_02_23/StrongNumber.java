package Lesson13_02_23;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entrer the number ");
		int no = sc.nextInt();
		int temp = no;
		int sum = 0;

		while (no > 0) {
			int rem = no % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			no = no / 10;
		}

		if (temp == sum) {
			System.out.println("strong number");
		} else {
			System.out.println("not a strong  number");
		}

	}
}
