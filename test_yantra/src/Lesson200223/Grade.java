package Lesson200223;

import java.util.Scanner;

public class Grade {

	static Scanner sc=new Scanner(System.in);
	
	static void grade()
	{
		System.out.println("enter the marks1");
		int m1=sc.nextInt();
		System.out.println("enter the marks2");
		int m2=sc.nextInt();
		System.out.println("enter the marks3");
		int m3=sc.nextInt();
		System.out.println("enter the marks4");
		int m4=sc.nextInt();
		System.out.println("enter the marks5");
		int m5=sc.nextInt();
		
		int sum=m1+m2+m3+m4+m5;
		
		int res=sum*100/500;
		System.out.println("persentage "+res);
		
		
		if(res>90)
		{
			System.out.println("grade  A");
		}
		else if(res>80 )
		{
			System.out.println("grade  B");
		}
		else if(res>60)
		{
			System.out.println("grade  C");
		}
		else
		{
			System.out.println("grade  D");
		}
	}
	
	
	public static void main(String[] args) {
		grade();
	}
}
