package Dowhile_Loop;

import java.util.Scanner;

public class Fibnacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int no=sc.nextInt();

	int f1=0;
	int f2=1;
	int f3=0;
	for(int i=1;i<=no-2;i++)
	{
		
		f3=f1+f2;
		
		f1=f2;
		f2=f3;
		
		
	}
	System.out.println(f3);
}
}
