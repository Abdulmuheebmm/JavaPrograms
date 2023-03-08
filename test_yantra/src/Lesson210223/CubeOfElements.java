package Lesson210223;

import java.util.Scanner;

public class CubeOfElements {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int cube=1;
	System.out.println("enter the size of an array");
	int size=sc.nextInt();
	
	int [] a=new int[size];
	int [] b=new int[size];
	
	System.out.println("enter the elements");
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
		 cube=a[i]*a[i]*a[i];
		System.out.println(cube);
	}
}
}
