package Lesson27023;

import java.util.Scanner;

public class SumofEelement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the row");
	int row=sc.nextInt();
	System.out.println("enter the column");
	int col=sc.nextInt();
	
	int [][]a=new int[row][col];
	
	for(int i=0;i<row;i++)
	{
		System.out.println("enter the elements");
		
		for(int j=0;j<col;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	
	int []x=new int[row];
	
	for(int i=0;i<row;i++)
	{
		int sum=0;
		for(int j=0;j<col;j++)
		{
			
			sum=sum+a[i][j];

		}
		x[i]=sum;
	
	
		System.out.println();
	}
	
	for(int k=0;k<x.length;k++)
	{
		System.out.print(x[k]+" ");
	}

	
	

}
}
