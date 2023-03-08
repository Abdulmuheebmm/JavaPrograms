package Lesson230223;

import java.util.Scanner;

public class RevreseArrayWithoutAnotherArray {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the size of array");
	int s1=sc.nextInt();
	int []a1=new int[s1];
	System.out.println("enter the elements in array");
	for(int i=0;i<a1.length;i++)
	{
		a1[i]=sc.nextInt();
	}
	int []b1=new int[a1.length];
	int count=0;
	for(int i=a1.length-1;i>=0;i--)
	{
		b1[count]=a1[i];
		count++;	
	}
	boolean flag=false;
	
	for(int i=0;i<b1.length;i++)
	{
		if(b1[i]==a1[i])
		{
			flag=true;
		}
	}
	if(flag==true)
	{
		System.out.println("palandrome");
	}
	else{
		System.out.println("not a palandrome");
	}
}
}
