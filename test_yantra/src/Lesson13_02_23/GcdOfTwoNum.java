package Lesson13_02_23;

import java.util.Scanner;

public class GcdOfTwoNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the num1");
		int no1 = sc.nextInt();
		System.out.println("enter the num2");
		int no2 = sc.nextInt();
		int gcd = 1;
		for (int i = 1; i < no1 && i <= no2; i++) {
			if (no1 % i == 0 && no2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("gcd is  " + gcd);
	}
}
