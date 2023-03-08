package programming;

import java.util.Scanner;

public class Food {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String email;
		long number;
		String password;

		System.out.println("enter the name ");
		name = sc.next();
		System.out.println("enter the email ");
		email = sc.next();
		System.out.println("enter the phone ");
		number = sc.nextLong();
		System.out.println("enter the password ");
		password = sc.next();

		System.out.println("account created\n\n\n ");

		System.out.println("1.login");
		int x = sc.nextInt();

		switch (x) {

		case 1: {

			System.out.println("enter the user name");
			String username = sc.next();
			System.out.println("enter the user password");
			String passwd = sc.next();

			if (username.equals(name) && passwd.equals(password)) {
				System.out.println("**************RESTURENTS****************");
				System.out.println("1.albakE\n2.udupi upahara\n3.friends cefe\n4.mane ruchi\n5five star chicken");
				int opt = sc.nextInt();

				switch (opt) {
				case (1): {
					System.out.println("WELCOME TO ALBAKE");
					System.out.println(
							"============FOOD============\n1.beryani\n2.chicken kaba\n3.butter panner\n4.pizza\n5.burger");
					int in = sc.nextInt();
					switch (in) {
					case (1): {
						System.out.println("beryani price is 270");
						break;
					}

					case (2): {
						System.out.println("chicken kaba price is 150");
						break;
					}

					case (3): {
						System.out.println("butter panner price is 130");
						break;
					}
					case 4: {
						System.out.println("shawarma");
						break;
					}
					case 5: {
						System.out.println("sweet");
						break;
					}
					default: {
						System.out.println("enter valid option");
					}

					}
				}
					break;

				case 2: {
					System.out.println("WELCOME TO UDUPI UPAHARA");
					System.out.println(
							"============FOOD============\n1.DOSA\n2.CHITRANNA\n3.butter MIL\n4.pizza\n5.burger");
					int in = sc.nextInt();
					switch (in) {
					case (1): {
						System.out.println("DOSA price is 270");
						break;
					}

					case (2): {
						System.out.println("CHITRANNA kaba price is 150");
						break;
					}

					case (3): {
						System.out.println("butter milk price is 130");
						break;
					}

					case 4: {
						System.out.println("shawarma price 70");
						break;
					}
					case 5: {
						System.out.println("sweet price 160");
						break;
					}
					default: {
						System.out.println("enter valid option");
					}

					}
				}

				case 3: {
					System.out.println("WELCOME TO FRIEND CAFE");
					System.out.println(
							"============FOOD============\n1.DOSA\n2.CHITRANNA\n3.butter MIL\n4.pizza\n5.burger");
					int in = sc.nextInt();
					switch (in) {
					case (1): {
						System.out.println("DOSA price is 270");
						break;
					}

					case (2): {
						System.out.println("CHITRANNA kaba price is 150");
						break;
					}

					case (3): {
						System.out.println("butter milk price is 130");
						break;
					}

					case 4: {
						System.out.println("shawarma price 70");
						break;
					}
					case 5: {
						System.out.println("sweet price 160");
						break;
					}
					default: {
						System.out.println("enter valid option");
					}

					}
				}
					break;

				case 4: {
					System.out.println("WELCOME TO ");
					System.out.println(
							"============FOOD============\n1.DOSA\n2.CHITRANNA\n3.butter MIL\n4.pizza\n5.burger");
					int in = sc.nextInt();
					switch (in) {
					case (1): {
						System.out.println("DOSA price is 270");
						break;
					}

					case (2): {
						System.out.println("CHITRANNA kaba price is 150");
						break;
					}

					case (3): {
						System.out.println("butter milk price is 130");
						break;
					}

					case 4: {
						System.out.println("shawarma price 70");
						break;
					}
					case 5: {
						System.out.println("sweet price 160");
						break;
					}
					default: {
						System.out.println("enter valid option");
					}

					}
				}
					break;

				case 5: {
					System.out.println("WELCOME TO 5 star chicken");
					System.out.println(
							"============FOOD============\n1.chicken\n2.chicken beryani\n3.butter chicken\n4.pizza chicken\n5.burger");
					int in = sc.nextInt();
					switch (in) {
					case (1): {
						System.out.println("chicken  price is 270");
						break;
					}

					case (2): {
						System.out.println("Chicken beryani kaba price is 150");
						break;
					}

					case (3): {
						System.out.println("butter chicken price is 130");
						break;
					}

					case 4: {
						System.out.println("pizza price 70");
						break;
					}
					case 5: {
						System.out.println("burger price 160");
						break;
					}
					default: {
						System.out.println("enter valid option");
					}

					}
				}
					break;

				}
			} else {
				System.out.println("invalid user name and password");
			}

			break;
		}
		case 2: {
			System.out.println("invalid option");
		}

		}

	}

}
