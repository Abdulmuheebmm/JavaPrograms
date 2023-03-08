package Lesson280223Assignmer;

import java.util.Scanner;

public class SentanceSplit {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the string in lower case ");
	String str=sc.next();

	String []a=str.split(" ",5);
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	
}
}
}
