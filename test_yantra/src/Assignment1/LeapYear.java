package Assignment1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int y = sc.nextInt();

			if(y%100==0)
			{
				if(y%400==0)
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not a leap year");
				}
			}
			else if(y%4==0)
			{
				System.out.println("is a leap year");
			}
			else
			{
				System.out.println("not a leap year");
			}

	}
}
