package programming;

import java.util.Scanner;

public class Year_std {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ENTER THE YEAR");
		int ye = sc.nextInt();

		if (ye == 2) {

			System.out.println("ENTER THE persentage");
			int pe = sc.nextInt();

			if (pe >= 80) {
				System.out.println("DISTINCTION");
			} else if (pe >= 60 && pe < 80) {
				System.out.println("first class");
			} else if (pe > 35 && pe < 60) {
				System.out.println("second class");
			} else {
				System.out.println("fail");
			}
		} else {
			System.out.println("NOT A STUDENTB OF SECOND YEAR");
		}

	}
}
