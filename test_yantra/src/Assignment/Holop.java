package Assignment;

import java.util.Scanner;

public class Holop {
public static void main(String[] args) {
	
int n=5;
	char c='a';
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==1 ||  i==n ||j==1 ||j==n||i==j||i+j==n+1)
			{
				System.out.print("* ");
			}
			else
			{
				
				System.out.print("  ");
			}
		
		}
		System.out.println();
	}
}
}
