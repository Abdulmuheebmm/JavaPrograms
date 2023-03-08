package Assignment1;

import java.util.Scanner;

public class LowerCaseOrUpperCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the alphbet ");
	char c=sc.next().charAt(0);
	
	if(c>='a'&& c<='z')
	{
		System.out.println("lower case");
	}
	else if(c>='A' && c<='z')
	{
		System.out.println("upper case");
	}
	else
	{
		System.out.println("enter alphabets ");
	}
}
}
