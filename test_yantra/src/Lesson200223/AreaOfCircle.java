package Lesson200223;

import java.util.Scanner;

public class AreaOfCircle {
	
	void cirecle()
	{	Scanner sc=new Scanner(System.in);
		final double pi=3.142;
		System.out.println("enter the radius of circle");
		int r=sc.nextInt();
		double result=pi*r*r;
		System.out.println("area of circle "+result);
	}
	
	
	
	
	
	
public static void main(String[] args) {
	
	

	AreaOfCircle ae=new AreaOfCircle();
	ae.cirecle();
}


}
