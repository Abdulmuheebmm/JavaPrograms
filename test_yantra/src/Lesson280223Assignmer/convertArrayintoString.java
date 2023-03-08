package Lesson280223Assignmer;

import java.util.Scanner;

public class convertArrayintoString {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	String []a={"bangalore"," chitradurga  ","mysore"};
	String s="";
	for(int i=0;i<a.length;i++)
	{
		s=s+a[i];
	}
	System.out.println(s);


	

}
}
