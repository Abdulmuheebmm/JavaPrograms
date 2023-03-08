package Lesson280223Assignmer;

import java.util.Scanner;

public class concat {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the string 1");
	String str=sc.next();

	System.out.println("enter the 2nd string");
	String str1=sc.next();
	
	System.out.println(str.concat(str1));
}
}
