package Assignment1;

import java.util.Scanner;

public class CompanyBonus {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ENTER THE SALARY");
	int sal=sc.nextInt();
	System.out.println("ENTER THE YEAR OF EXP");
	int exp=sc.nextInt();
	
	if(exp>5)
	{
		System.out.println("your salary is"+sal);
		int bonus=sal*5/100;
		System.out.println("your bonus is "+bonus);
		int net=sal+bonus;
		System.out.println("your net salary is "+net);
	}
	else
	{
		System.out.println("your exp is less");
	}
}
}
