package Lesson13_02_23;

import java.util.Scanner;

public class SumOfPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no1 = sc.nextInt();
		System.out.println("enter the num2");
		int no2 = sc.nextInt();
		int sum = 0;
		int j = 2;

		for (int i = no1; i <= no2; i++) {
			int n = i;
			boolean flag = true;
			for (j = 2; j < n; j++) {
				if (n % j == 0) {
					flag = false;
				}
			}
			if (flag == true) {
				sum += n;
			}

		}
		System.out.println("sum  " + sum);
	}
}
