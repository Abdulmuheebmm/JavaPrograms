package Lesson13_02_23;

import java.util.Scanner;

public class Table11to20 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the starting range");
	int x= sc.nextInt();
	System.out.println("enter the second range");
	int y=sc.nextInt();
	for(int i=x;i<=y;i++)
	{
		for(int j=1;j<=10;j++)
		{
			int ans=i*j;
			System.out.println(i+"*"+j+"="+ans);
		
		}
		System.out.println("--------------------------------");
	}
}
}
