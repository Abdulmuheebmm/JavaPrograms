package Dowhile_Loop;

import java.util.Scanner;

public class ProductOffPNum {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the possitive number");
	int s=sc.nextInt();
	int p=1;
	do{
		if(s>=0)
		{
			System.out.println(p);
			p=p*s;
			
		}
		else
		{
			System.out.println("enter +v number");
		}
		
		s--;
	}while(s>0);
	
	
}
}
