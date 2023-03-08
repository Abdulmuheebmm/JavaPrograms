package Array2D;

import java.util.Scanner;

public class SumOf2D {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENTER THE ROW ");
	int row=sc.nextInt();
	System.out.println("ENTER THE COLUNM");
	int col=sc.nextInt();
	
	int [][]a=new int[row][col];
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println("enter the elements");
		for(int j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	
	
	
	for(int i=0;i<a.length;i++)
	{
		int sum=0;
		for(int j=0;j<a[0].length;j++)
		{
			sum=sum+a[i][j];
		}
		System.out.println(sum);
	}
	
	
	

}
}
