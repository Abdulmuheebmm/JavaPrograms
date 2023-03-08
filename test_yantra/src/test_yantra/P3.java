package test_yantra;

import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the length of rectangle");
		double length =sc.nextDouble();
		System.out.println("enter the breadth of rectangle");
		double breadth=sc.nextDouble();
		
		double result=length*breadth;
		double result1=2*length+breadth;
		
		System.out.println("area of rectangle is "+result);
		
		System.out.println("perimeter of rectangle is "+result1);
	}
}
