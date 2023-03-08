package test_yantra;

import java.util.Scanner;

public class P14 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter your persentage");
	int no=sc.nextInt();
	
	
	if(no>=85)
	{
		System.out.println("distintion");
	}
	else if(no>=35 && no<85)
	{
		System.out.println("first class");
	}
	else
	{
		System.out.println("fail");
	}
	
}
}
