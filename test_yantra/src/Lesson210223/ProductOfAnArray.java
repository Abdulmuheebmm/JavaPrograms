package Lesson210223;

import java.util.Scanner;

public class ProductOfAnArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	int prod=1;
	System.out.println("enter the size of an array");
	int size=sc.nextInt();
	
	int[]a=new int[size];
	
	System.out.println("enter the elements");
	
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
		prod=prod*a[i];
		System.out.println(prod);
	}
	
	
	
}
}
