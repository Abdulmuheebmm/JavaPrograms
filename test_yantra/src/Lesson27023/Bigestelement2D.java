package Lesson27023;

import java.util.Scanner;

public class Bigestelement2D {
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
	

	
	for(int i=0;i<row;i++)
	{
int max=a[i][0];
		for(int j=0;j<col;j++)
		{
			
	if(a[i][j]>max)
	{
		max=a[i][j];
	}

		}
		System.out.println(max);

	
	
		System.out.println();
	}
}
}
