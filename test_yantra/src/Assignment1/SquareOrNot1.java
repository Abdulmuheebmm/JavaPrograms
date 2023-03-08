package Assignment1;

import java.util.Scanner;

public class SquareOrNot1 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the length");
	int l=sc.nextInt();
	System.out.println("enter the breadth");
	int b=sc.nextInt();
	
		if(l==b)
		{
			System.out.println("it is square");
		}
		else
		{
			System.out.println("not a squares");
		}
	
}
}
