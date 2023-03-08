package Lesson200223;

import java.util.Scanner;

public class AvrageOfMarks {
	Scanner sc=new Scanner(System.in);
	void marks()
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
	}
	
	
	public static void main(String[] args) {
		AvrageOfMarks av=new AvrageOfMarks();
		av.marks();
	}
}
