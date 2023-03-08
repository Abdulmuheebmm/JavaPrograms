package Lesson210223;

import java.util.Scanner;

public class PrimeArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the size");
	int s=sc.nextInt();
	
	int []a=new int[s];
	
	System.out.println("enter the elements");
	
	for(int i=0;i<s;i++)
	{
		a[i]=sc.nextInt();
	}
	
for(int i=0;i<a.length;i++)
{
	boolean flag=true;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			flag = false;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println(a[i]);
	}
}
	
	
	
	
}
}
