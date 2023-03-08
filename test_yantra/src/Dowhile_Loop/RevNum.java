package Dowhile_Loop;

import java.util.Scanner;

public class RevNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();// 12345
		int temp = no;
		int rev = 0;

		while (no > 0) {
			int rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		if (temp == rev) {
			System.out.println("number is palandrom  " + rev);
		} else {
			System.out.println("number is not a palandrome  " + rev);
		}
	}
}
