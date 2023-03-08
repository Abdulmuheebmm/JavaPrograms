package Lesson160223;

import java.util.Scanner;

public class SunnyNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int s=n+1;
	boolean x=false;
	
	for(int i=1;i<=s/2;i++)
	{
		if(i*i==s)
		{
			x=true;
			break;
		}
		
	}
	
	if(x)
	{
		System.out.println("sunny num");
	}
	else
	{
		System.out.println("not a sunny num");
	}
}
}
