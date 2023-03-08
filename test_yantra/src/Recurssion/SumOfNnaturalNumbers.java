package Recurssion;


import java.util.Scanner;

public class SumOfNnaturalNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
	  System.out.println(sum(10));
	}
	
	



static int sum(int n)
{
	if(n<=1)
	{
		return n;
	}
	else
	{
		return n+sum(n-1);
	}
	
}
}
