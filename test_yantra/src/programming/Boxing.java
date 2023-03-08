package programming;

import java.util.Scanner;

public class Boxing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE AGE");
		int age = sc.nextInt();

		System.out.println("ENTER THE WEIGHT");
		int weight = sc.nextInt();

		if (age > 25) {
			if (weight > 60) {
				System.out.println("ELIGIBLE FOR BOXING");
			} else {
				System.out.println("NOT ELIGIBLE FOR BOXING");
			}
		} else {
			System.out.println("UNDER AGE-NOT ELIGIBLE");
		}

	}
}
