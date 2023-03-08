package Assignment2;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting number");
		int no=sc.nextInt();
		System.out.println("enter the ending number");
		int no1=sc.nextInt();
		
		int fact =1;
		for(int i=no;i<=no1;i++)
		{
			fact=fact*i;
			System.out.println(fact);
		}

		
	}

	
	
}
