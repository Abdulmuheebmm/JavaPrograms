package Lesson230223;

import java.util.Scanner;

public class ArrayIdentical {
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
	
	//-----------------------------------------------------------------------------------------
	System.out.println("enter the size of 2nd array");
	int s2=sc.nextInt();
	int []a2=new int[s2];
	System.out.println("enter the elements in 2nd array");
	for(int i=0;i<a2.length;i++)
	{
		a2[i]=sc.nextInt();
	}
	boolean flag=false;
//	---------------------------------------------------------------------------------------------
	if(a1.length==a2.length)
	{
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==a2[i])
			{
				flag=true;
			}
		}
	}
	else{
		System.out.println("not identical");
	}
	
	if(flag==true)
	{
		System.out.println("identical");
	}
	else
	{
		System.out.println("not identical");
	}
	
	
	
	

}
}
