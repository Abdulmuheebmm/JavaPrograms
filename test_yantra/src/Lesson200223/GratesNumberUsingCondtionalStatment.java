package Lesson200223;

import java.util.Scanner;

public class GratesNumberUsingCondtionalStatment 
{
	
	static Scanner sc=new Scanner(System.in);
	
	static void gratest()
	{
		System.out.println("enter the num1");
		int a=sc.nextInt();
		System.out.println("enter the num2");
		int b=sc.nextInt();
		System.out.println("enter the num3");
		int c=sc.nextInt();
		
	int res=	(a>b) && (a>c) ?a:(b>c)?b:c; 
	System.out.println(res);
		
		
	}
	
	public static void main(String[] args) {
		gratest();
	}

}
