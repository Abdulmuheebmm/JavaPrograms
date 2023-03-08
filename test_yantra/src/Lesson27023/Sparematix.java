package Lesson27023;

import java.util.Scanner;

public class Sparematix {
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
	
	
	int zero=0;
	int num=0;
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			if(a[i][j]==0)
			{
				zero++;
			}
			else
			{
				num++;
			}
		}
	}
	
	if(zero>num)
	{
		System.out.println("spare matrix");
	}
	else
	{
		System.out.println("not a spare");
	}
	
	
	
	
}
}
