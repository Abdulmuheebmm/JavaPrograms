package Lessson240223;

import java.util.Scanner;

public class characterpalandrome {
	

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			char [] a= {'a','g','a'};
			
			char [] b = new char[a.length];
			int count=0;
			for(int i=a.length-1;i>=0;i--)
			{
				b[count++]=a[i];
			}
			
			for(int i=0;i<b.length;i++)
			{
				System.out.print(b[i]+" ");
			}
			boolean flag=true;
			for(int i=0;i<a.length;i++)
			{
				if(b[i]==a[i])
				{
					
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(" palindrom character");
			}
			else
			{
				System.out.println(" not a palindrom character");
			}
		}

	}

