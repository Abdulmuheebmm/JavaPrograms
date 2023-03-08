package ForLoop;

import java.util.Scanner;

public class Print4SameLine {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int no=sc.nextInt();
	for(int i=1;i<=no+1;i++)
	{
		
		System.out.print(no);
	}
}
}
