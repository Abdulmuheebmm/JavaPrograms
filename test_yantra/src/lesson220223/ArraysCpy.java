package lesson220223;

import java.util.Scanner;

public class ArraysCpy {
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
	
	for(int i=s-1;i>=0;i--)
	{
		int x=a[i];
		int fact =1;
				for(int j=1;j<=x;j++)
				{
					fact=fact*j;
				}
				System.out.println(fact);
				
	}
}
}
