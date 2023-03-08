package Lesson13_02_23;

import java.util.Scanner;

public class Factors_Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
				
			}
		}
		System.out.println(sum);
	}
}
