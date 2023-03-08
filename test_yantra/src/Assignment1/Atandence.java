package Assignment1;

import java.util.Scanner;

public class Atandence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of classes");
	int nc=sc.nextInt();
	System.out.println("enter the number of classes attended");
	int ac=sc.nextInt();
		
		int per=ac*nc/100;
		System.out.println(per);
		if(per>75)
		{
			System.out.println("eligible for exam" );
		}
		else
		{
			System.out.println("not eligible");
		}
}
}
