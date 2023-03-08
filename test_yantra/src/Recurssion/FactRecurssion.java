package Recurssion;

import java.util.Scanner;

public class FactRecurssion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbrer");
		int n = sc.nextInt();

		fact(n);
	}

	private static int fact(int n) {

		if (n <= 1) {
			return n;
		} else {
			return n *fact(n - 1);
		}

	}
}
