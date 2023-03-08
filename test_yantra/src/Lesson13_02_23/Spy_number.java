package Lesson13_02_23;

import java.util.Scanner;

public class Spy_number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number to check spy or not");
		int no = sc.nextInt();
		int sum = 0;
		int prod = 1;

		while (no > 0) {
			int rem = no % 10;
			sum = sum + rem;
			prod = prod * rem;
			no = no / 10;

		}
		if (sum == prod) {
			System.out.println("spy num " + sum + " ==> " + prod);
		} else {
			System.out.println("not a spy num");
		}

	}
}
