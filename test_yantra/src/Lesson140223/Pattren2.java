package Lesson140223;

import java.util.Scanner;

public class Pattren2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		int x=n;
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
				
			}
		
		System.out.println();
		}
	}
}
