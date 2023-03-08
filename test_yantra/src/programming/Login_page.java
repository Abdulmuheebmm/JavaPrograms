package programming;

import java.util.Scanner;

public class Login_page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the user name");
		int us = sc.nextInt();

		if (us == 123) {
			System.out.println("enter the password");
			int ps = sc.nextInt();
			if (ps == 12345) {
				System.out.println("LOGIN SUCCESSFULL");
			} else {
				System.out.println("LOGIN FAILED-ENTER VALID PASSWORD");
			}
		} else {
			System.out.println("enter the valid user name ");
		}
	}
}
