package Lesson280223Assignmer;

import java.util.Scanner;

public class PGM2 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the string 1");
	String str=sc.next();

String rev="";
for(int i=str.length()-1;i>=0;i--)
{
	rev=rev+str.charAt(i);
	
}
System.out.println(rev);
	
}
}
