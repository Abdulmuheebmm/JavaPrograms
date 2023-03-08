package Lesson13_02_23;

import java.util.Scanner;

public class Composit_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no = sc.nextInt();
		int temp=0;
	for(int i=2;i<no;i++)
	{
		if(no%i==0)
		{
			temp=temp+1;
		}
	}
	if(temp>0)
	{
		System.out.println("composit number");
	}
	else{
		System.out.println("not a composit number");
	}
		
	}
}
