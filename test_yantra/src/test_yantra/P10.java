package test_yantra;

import java.util.Scanner;

public class P10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the number to check possitive or nagative");
	int no=sc.nextInt();
	
		if(no>=0)
		{
			System.out.println("number is possitive"+no);
		}
		else
		{
			System.out.println("number is nagative"+no);
		}
}
}
