package Lesson280223;

import java.util.Scanner;

public class DynamicInpReadPIndex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the string");
	String str=sc.next();
	System.out.println("enter the char to fetch the  index ");
	String in=sc.next();
	int ans =str.indexOf(in);
	System.out.println("index -> "+ans);
}
}
