package test_yantra;

import java.util.Scanner;

public class P18 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter age");
	int age=sc.nextInt();
	
	if(age>=18)
	{
		System.out.println("eligible for vote");
	}
	else
	{
		System.out.println(" not eligible for vote");
	}
}
}
