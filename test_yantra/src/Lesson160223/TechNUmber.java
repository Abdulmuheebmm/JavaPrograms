package Lesson160223;

import java.util.Scanner;

public class TechNUmber {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int no=sc.nextInt();
	int cpy=no;
	int count=0;
	int sum=0;
	while(cpy!=0)
	{
		cpy=cpy/10;
		count++;
	}
	if(count%2==0)
	{
		int d=count/2;
		int pow=1;
		for(int i=1;i<=d;i++)
		{
			pow*=10;	
		
		}	
		
		int ans1=no%pow;
		int ans2=no/pow;
		sum=ans1+ans2;
		
		sum=sum*sum;
		if(sum==no)
		{
			System.out.println("tech num");
		}
		else{
			System.out.println("not a tech");
		}
		
	
		
		
	}
	else
	{
		System.out.println("not a tech number");
	}
}
}
