package Lesson140223;

import java.util.Scanner;

public class pattren {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	int n=sc.nextInt();
	
	for(int i=5;i>=1;i--)
	{
		
		for(int j=5;j>=i;j--)
		{
			System.out.print(i+" ");
			
		}
		
	System.out.println();
	}
}
}