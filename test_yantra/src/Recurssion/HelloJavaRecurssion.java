package Recurssion;

import java.util.Scanner;

public class HelloJavaRecurssion {

	static void hello(int count)
	{
		if(count<1)
		{
			return;
		}
		
		else
		{
			System.out.println("HAPPY BIRTH DAY");
			hello(count-1);
			
		}
	}
	
	public static void main(String[] args) {
		System.out.println("enter the number to print ");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		hello(x);
	}
}
