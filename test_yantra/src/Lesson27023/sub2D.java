package Lesson27023;

import java.util.Scanner;

public class sub2D {
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
	

	
	
	int [][]b=new int[row][col];
	
	for(int i=0;i<row;i++)
	{
		System.out.println("enter the 2nd array elements");
		
		for(int j=0;j<col;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	
	int [][]c=new int [row][col];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
		}
	}
	
	
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
}
}
