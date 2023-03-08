package Lesson13_02_23;

import java.util.Scanner;

public class EvenOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the number");
	int no=sc.nextInt();
	int rev=0;
	while(no>0)
	{
		int rem=no%10;
		rev=rev*10+rem;
	
		no=no/10;
	
	}
	if(rev%2==0)
	{
		System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}
}
}
