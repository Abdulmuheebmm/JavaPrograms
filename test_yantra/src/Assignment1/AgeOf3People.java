package Assignment1;

import java.util.Scanner;

public class AgeOf3People {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the 1st person age");
	int a=sc.nextInt();
	System.out.println("enter the 1sd person age ");
	int b=sc.nextInt();
	System.out.println("enter the 3rd person age");
	int c=sc.nextInt();
if(a>b&&a>c)
{
	System.out.println(a);
}
else if(b>a && b>c)
{
	System.out.println(b);
}
else 
{
	System.out.println(c);
}


	
if(a<b&&a<c)
{
	System.out.println("smallest"+a);
}
else if(b<a && b<c)
{
	System.out.println("smallest"+b);
}
else 
{
	System.out.println("smallest"+c);
}
	
	
}
}
