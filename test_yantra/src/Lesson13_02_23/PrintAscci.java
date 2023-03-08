package Lesson13_02_23;

import java.util.Scanner;

public class PrintAscci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	char c=sc.next().charAt(0);
	if(c>='a' || c<='z')
	{
		int x=c;
		System.out.println(c+"  "+x);
	}
}
}
