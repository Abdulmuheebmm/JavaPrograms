package Lesson200223;

import java.util.Scanner;

public class CircumferenceOfCircle {
static Scanner sc=new Scanner(System.in);
	
	static void circumference()
	{
		System.out.println("enter the area of circle");
		int r=sc.nextInt();
		
		final double pi=3.142;
		double res=2*pi*r;
		System.out.println(" circumference "+res);
	}
	
	
	public static void main(String[] args) {
		circumference();
	}
}
