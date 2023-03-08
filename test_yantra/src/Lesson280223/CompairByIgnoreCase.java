package Lesson280223;

import java.util.Scanner;

public class CompairByIgnoreCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string 1");
		String str=sc.next();

		
		System.out.println("enter the string 2 to compair");
		String str1=sc.next();
		
		System.out.println(str.equalsIgnoreCase(str1));
	}
}
