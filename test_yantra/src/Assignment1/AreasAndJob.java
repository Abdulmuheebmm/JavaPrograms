package Assignment1;

import java.util.Scanner;

public class AreasAndJob {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENTER THE AGE");
	int age=sc.nextInt();
	System.out.println("ENTER THE SEX m or f");
	char sex=sc.next().charAt(0);
	System.out.println("ENTER THE MARITAL STATUS y or n");
	char m=sc.next().charAt(0);
	
	if(sex=='f')
	{
		System.out.println("urben");
	}
	else if(age>40 && age<=60)
	{
		System.out.println("only urben");
	}
	else
	{
		
		System.out.println("any where");
	}
}
}
