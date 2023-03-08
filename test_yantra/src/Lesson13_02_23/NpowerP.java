package Lesson13_02_23;

import java.util.Scanner;

public class NpowerP {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int no=sc.nextInt();
	System.out.println("enter the power");
	int po=sc.nextInt();
int re=1;
	
	for(int i=1;i<=po;i++)
	{
	 re= no*re;
	
	}
	System.out.println(re);
	
	
}
}
