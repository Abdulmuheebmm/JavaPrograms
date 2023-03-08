package Assignment1;

import java.util.Scanner;

public class GratesOfTwoNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("ENTER THE NUM1 VALUE");
	int num1=sc.nextInt();
	System.out.println("ENTER THE NUM2 VALUE");
	int num2=sc.nextInt();
	
	if(num1>num2)
	{
		System.out.println("gratest is num1 "+num1);
	}
	else
	{
		System.out.println("gratest is num2 "+num2);
	}
	
}
}
