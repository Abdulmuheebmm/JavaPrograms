package programming;

import java.util.Scanner;

public class Example_Program_ {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("ENTER THE NUMBER");
	int no=sc.nextInt();
	
	if(no>100)
	{
		if(no<200)
		{
			System.out.println("NUMBER IS IN THE RANGE OF 100 AND 200");
		}
		else 
		{
			System.out.println("NUMBER IS NOT IN  THE RANGE OF 100 AND 200");
		}
	}
	else
	{
		System.out.println("number is lesser than 100");
	}
}
}
