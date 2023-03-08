package lesson220223;

import java.util.Scanner;

public class MaxArray {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the size of array");
	int s=sc.nextInt();
	int [] a=new int[s];
	System.out.println("enter the elements");
	
	for(int i=0;i<s;i++)
	{
		a[i]=sc.nextInt();
	}
	int max=a[0];
	int min=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]>max)
		{
			max=a[i];
		}

	}
	System.out.println("max is "+max);
	
	
	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]<min)
		{
			min=a[i];
		}

	}
	System.out.println("min is "+min);
	
}
}
