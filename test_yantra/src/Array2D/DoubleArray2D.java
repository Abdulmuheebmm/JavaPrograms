package Array2D;

import java.util.Scanner;

public class DoubleArray2D {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENTER THE ROW ");
	int row=sc.nextInt();
	System.out.println("ENTER THE COLUNM");
	int col=sc.nextInt();
	
	double [][]a=new double[row][col];
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println("enter the row elements");
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextDouble();
		}
				
	}
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+"  ");
		}
	}
	
	
	
	
	
	
}
}
