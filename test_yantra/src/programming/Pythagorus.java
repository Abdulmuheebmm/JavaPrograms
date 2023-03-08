package programming;

import java.util.Scanner;

public class Pythagorus {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	

	System.out.println("ENTER THE 1st SIDE OF TRIANGLE");
	int a=sc.nextInt();
	
	System.out.println("ENTER THE 2st SIDE OF TRIANGLE");
	int b=sc.nextInt();
	
	System.out.println("ENTER THE 3st SIDE OF TRIANGLE");
	int c=sc.nextInt();

	
	if(a*a+b*b == c*c || c*c+b*b==a*a || a*a + c*c==b*b )
	{
		System.out.println("pythogarus");
	}
	else
	{
		System.out.println("not a py");
	}
	
}
}
