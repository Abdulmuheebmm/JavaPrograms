package Lesson210223;

import java.util.Scanner;

public class RevArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the size");
	int s=sc.nextInt();
	
	int []a=new int[s];
	
	int [] b=new int [a.length];
	
	
	
	
	System.out.println("enter the elements");
	for(int i=a.length-1;i>=0;i--)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
System.out.println(a[i]);
	}
}
}
