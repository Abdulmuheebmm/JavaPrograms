package Lesson27023;

import java.util.Scanner;

public class MatrixMultiplication {
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
	int [][]b=new int [row][col];
	for(int i=0;i<row;i++)
	{
		System.out.println("enter the 2nd array element");
		for(int j=0;j<col;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	int [][]mul=new int[row][col];

	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			for(int k=0;k<row;k++)
			{
				mul[i][j]=a[i][j] * b[i][j];
			}
		}
		System.out.println();
		
	}
	
	
	
}
}
