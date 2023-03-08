package ForLoop;

import java.util.Scanner;

public class NumerFromNto1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int no=sc.nextInt();
	
	for(int i=no;i>=1;i--)
	{
		System.out.println(i);
	}
}
}
