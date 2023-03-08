package Lesson160223;

import java.util.Scanner;

public class XylemorPhloem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int sum2=0;
	int sum1=n%10;
	n=n/10;
	
	while(n>9)
	{
		int rem=n%10;
		sum2=sum2+rem;
		n=n/10;
	}
	sum1=sum1+n;
	if(sum1==sum2)
	{
		System.out.println("xylem num");
	}
	else
	{
		System.out.println("phloem num" +sum1+sum2);
	}
}
}
