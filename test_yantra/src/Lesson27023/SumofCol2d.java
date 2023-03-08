package Lesson27023;

import java.util.Scanner;

public class SumofCol2d {
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
	
	
	for(int i=0;i<col;i++)
	{
		int sum=0;
		for(int j=0;j<row;j++)
		{
			sum=sum+a[j][i];
		}
		System.out.println(sum);
		
	
	
		System.out.println();
	}
}
}
