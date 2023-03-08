package Lesson180223;

import java.util.Scanner;

public class Polygon {
static Scanner sc=new Scanner(System.in);

static void areaOfRectangle(int x,int y)
{
	int r=x*y;
	System.out.println("are of rectangle"+r);
}


static void areaOfSquare(int x)
{
	int r=x*x;
	System.out.println("area of square");
}


static void areaOfCircle(double x)
{
	final double  pi=3.142;
	double r=pi*x*x;
	System.out.println("area of circle"+r);
	
}

static void areaOfTraingle(double x,double y)
{
	double h=1/2;
	double r=h*x*y;
	System.out.println("area of traingle"+r);
}

public static void main(String[] args) {
	System.out.println("1:AREA OF RECTANGLE\n2:AREA OF SQUARE\n3:AREA OF CIRCLE\n4:ARE OF TRAINGLE");
	
	switch(sc.nextInt())
	{
		case 1:
		{
			System.out.println("enter the length");
			int x=sc.nextInt();
			System.out.println("enter the bredth");
			int y=sc.nextInt();
			areaOfRectangle(x,y);
		}break;
		
		
		case 2:
		{
			System.out.println("enter tha side");
			int x=sc.nextInt();
			areaOfSquare(x);
			
		}break;
		
		case 3:
		{
			System.out.println("entre tha radius");
			double x=sc.nextDouble();
			areaOfCircle(x);
			
		}break;
		
		case 4:
		{
			System.out.println("enter the length");
			double x=sc.nextInt();
			System.out.println("enter the bredth");
			double y=sc.nextInt();	
			areaOfTraingle(x,y);
		}break;
		
		default:
		{
			System.out.println("enter valid option");
		}
		
		
		
	}
}
	
	
	
}
