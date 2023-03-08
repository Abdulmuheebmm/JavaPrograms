package test_yantra;

import java.util.Scanner;

public class P11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	

	System.out.println("enter the character");
	char c=sc.next().charAt(0);
	
	int x=Character.getNumericValue(c);
	
		if(c>='A' && c<='Z' || c>='a' && c<='z'  )
		{
			System.out.println("character");
		}
		
		else if(c>=0 && c<=9)
		{
			System.out.println("number");
		}
		else
		{
			System.out.println("special character");
		}
	System.out.println(x);
	
}
}
