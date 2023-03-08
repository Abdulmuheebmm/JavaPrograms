package Lesson27023;

import java.util.Scanner;

public class IdenticalorNot2D {
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
	
	
	
boolean flag=false;
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		if(b[i][j]==a[i][j])
		{
			flag=true;
		}
	}
}

if(flag==true)
{
	System.out.println("identical");
}

else
{
	System.out.println("not identical");
}

}
}
