package Lessson240223;

import java.util.Scanner;

public class InsertAnElementAtSpIND {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	System.out.println("enter the elements in an array");
	int []a=new int[size];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	int []aa=new int[a.length+1];
	
	
	System.out.println("enter the index to inser the element");
	int ind=sc.nextInt();
	System.out.println("enter the element");
	int n=sc.nextInt();
	int j=0;
	for(int i=0;i<a.length;i++)
	{
		if(j==ind)
		{
			aa[j]=n;
			j++;
		}
		
		aa[j]=a[i];
		j++;	
	}
	
	
for(int i=0;i<aa.length;i++)
{
	System.out.println(aa[i]);
}
	
	
	
}
}
