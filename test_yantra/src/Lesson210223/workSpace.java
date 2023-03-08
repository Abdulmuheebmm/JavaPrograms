package Lesson210223;

import java.util.Scanner;

public class workSpace {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array");
	int n =sc.nextInt();
	double a[]=new double [n];
	System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextDouble();
	}
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	
}
}
