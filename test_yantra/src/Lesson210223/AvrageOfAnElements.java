package Lesson210223;

import java.util.Scanner;

public class AvrageOfAnElements {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int sum=0;
	int avg=0;
	
	System.out.println("enter the size of an array");
	int size=sc.nextInt();
	
	int [] arr=new int[size];
	
	System.out.println("enter the elements");
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
sum=sum+arr[i];
		
		avg=sum/size;
		
	}
	System.out.println(avg);
	
	
}
}
