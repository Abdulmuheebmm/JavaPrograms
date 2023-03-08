package Lesson180223;

import java.util.Scanner;

public class Calculator {
static Scanner sc=new Scanner(System.in);

	static void add()
	{
		System.out.println("ENTER THE NUM 1");
		int a=sc.nextInt();
		System.out.println("ENTER THE NUM 2");
		int b=sc.nextInt();
		
		int c=a+b;
		System.out.println("SUME IS:"+c);	
	}
	
	static void sub()
	{

		System.out.println("ENTER THE NUM 1");
		int a=sc.nextInt();
		System.out.println("ENTER THE NUM 2");
		int b=sc.nextInt();
		
		int c=a-b;
		System.out.println("SUb IS:"+c);
	}
	
	static void prod()
	{

		System.out.println("ENTER THE NUM 1");
		int a=sc.nextInt();
		System.out.println("ENTER THE NUM 2");
		int b=sc.nextInt();
		
		int c=a*b;
		System.out.println("pro IS:"+c);
	}
	
	static void reminder()
	{
		System.out.println("ENTER THE NUM 1");
		int a=sc.nextInt();
		System.out.println("ENTER THE NUM 2");
		int b=sc.nextInt();
		
		int c=a%b;
		System.out.println("reminder IS:"+c);
	}
	
	static void div()
	{
		System.out.println("ENTER THE NUM 1");
		int a=sc.nextInt();
		System.out.println("ENTER THE NUM 2");
		int b=sc.nextInt();
		
		int c=a/b;
		System.out.println("div IS:"+c);
	}
	
	static void discount()
	{
		System.out.println("ENTER THE  AMOUNT");
		int a=sc.nextInt();
		System.out.println("ENTER THE % of discount");
		int b=sc.nextInt();
		
		int c=a*b/100;
		System.out.println("pro IS:"+c);
	}
	
	
	public static void main(String[] args) {
		System.out.println("*************calculator***************\n1:ADD\n2:SUB\n3:PROD\n4:REMINDER\n5:DIV\n6:DISCOUNT");
		int opt=sc.nextInt();
		
	switch(opt)
	{
		case 1:
		{
			add();
		}break;
		
		
		case 2:
		{
			sub();
		}break;
		
		case 3:
		{
			prod();
		}break;
		
		case 4:
		{
			reminder();
		}break;
		
		case 5:
		{
			div();
		}break;
		
		case 6:
		{
			discount();
		}break;
		
		default :
		{
			System.out.println("ENTER VALID OPTION");
		}
		
		
		
		
	}
		
		
		
		
	}
	
}
