package test_yantra;

import java.util.Scanner;

public class P16 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter num1");
	int no1=sc.nextInt();
	System.out.println("enter num2");
	int no2=sc.nextInt();
	System.out.println("enter num3");
	int no3=sc.nextInt();
	
	int sum=no1+no2+no3;
	System.out.println("sum is "+sum);
	
	if(sum>50)
	{
		System.out.println("sum is grater than 50");
	}
	
	else
	{
		System.out.println("sum is not grater than 50");
	}
}
}
