package test_yantra;

import java.util.Scanner;

public class P12 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	
	int no=sc.nextInt();
	
	if(no%8==0)
	{
		System.out.println("multiple by 8 "+no);
	}
	
	else{
		System.out.println("not multiple by 8 "+no);
	}
}
}
