package Lesson210223;

import java.util.Scanner;

public class CopyingAnArray {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the size");
	int s=sc.nextInt();
	
	int [] a =new int[s];
	int [] b=new int[a.length];
	System.out.println("enter the elements");
	for(int i=0;i<s;i++)
	{
		a[i]=sc.nextInt();
	}
	
	
	b=a;
	for(int i=0;i<b.length;i++)
	{
		System.out.println(b[i]);
	}
	
}
}
