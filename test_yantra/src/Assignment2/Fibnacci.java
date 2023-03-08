package Assignment2;

import java.util.Scanner;

public class Fibnacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the number");
	int no=sc.nextInt();
	int a=0;
	int b=1;
	int c=0;
	


		
		for(int i=1;i<no;i++)
		{
			
			if(i==no)
			{
				System.out.println(a);
			}
			c=a+b;
			
			a=b;
			b=c;
		}
	
}
}
