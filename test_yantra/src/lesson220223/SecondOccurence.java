package lesson220223;

import java.util.Scanner;

public class SecondOccurence {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the size of array");
	int s=sc.nextInt();
	int [] a=new int[s];
	System.out.println("enter the elements");
	int count=0;
	for(int i=0;i<s;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]==20)
		{
			count++;
			if(count==2)
			{
				System.out.println(i);
			}
			
		}
		
		
		
	}
	
	
	
	
}
}
