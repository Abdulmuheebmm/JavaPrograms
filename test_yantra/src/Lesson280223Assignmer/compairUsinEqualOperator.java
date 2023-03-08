package Lesson280223Assignmer;

import java.util.Scanner;

public class compairUsinEqualOperator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the string 1");
	String str=sc.next();

	System.out.println("enter the 2nd string");
	String str1=sc.next();
	
	System.out.println("by using equal operator      "+str==str1);
	System.out.println("by using equals method       "+str.equals(str1));
	System.out.println("by using compair to method   "+ str.compareTo(str1));
	System.out.println("equals ignore case           "+str.equalsIgnoreCase(str1));
}
}
