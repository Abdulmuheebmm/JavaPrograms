package Lesson280223;

import java.util.Scanner;

public class SubString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the string");
	String str=sc.next();
	System.out.println("entrer the index to fetch sub string");
	int x=sc.nextInt();
	
	System.out.println(str.substring(x));
}
}
