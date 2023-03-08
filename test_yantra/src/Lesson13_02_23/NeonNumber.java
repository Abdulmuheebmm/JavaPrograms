package Lesson13_02_23;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int sum = 0;
		int square = num * num;
		while (square > 0) {
			int rem = square % 10;
			sum = sum + rem;
			square = square / 10;
		}
		if (sum == num) {
			System.out.println("num is neon  " + sum);
		} else {
			System.out.println("num is not neon  " + sum);
		}

	}
}
