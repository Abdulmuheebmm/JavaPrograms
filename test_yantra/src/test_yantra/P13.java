package test_yantra;

import java.util.Scanner;

public class P13 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	
	System.out.println("enter the number");
	int no=sc.nextInt();
	if(6/no==0)
	{
		System.out.println("divisibal by 6");
	}
	
	else
	{
		System.out.println("not divisible by 6");
	}
}
}
