package programming;

import java.util.Scanner;

public class Student_details {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENTER THE NAME");
	String name=sc.nextLine();
	
	System.out.println("ENTER THE ROLL NUM");
	int roll=sc.nextInt();
	
	System.out.println("ENTER THE MARKS ");
	
	System.out.println("----------------------------");
	System.out.println("ENTER THE PHYSICS MARKS");
	int p=sc.nextInt();
	
	System.out.println("ENTER THE CHEMISTRY MARKS");
	int c=sc.nextInt();
	
	System.out.println("ENTER THE ENGLISH MARKS");
	int e=sc.nextInt();
	
	System.out.println("ENTER THE JAVA MARKS");
	int j=sc.nextInt();
	
	System.out.println("ENTER THE MATHS MARKS");
	int m=sc.nextInt();
	
	System.out.println("name "+name);
	System.out.println("roll "+roll);
	
	 int sum=p+c+e+j+m;
	int result= 100*sum/500;
	System.out.println(result);
	
	if(result>=90)
	{
		System.out.println("A");
	}
	else if(result>80 && result <90)
	{
		System.out.println("B");
	}
	else if (result >0 && result<=80)
	{
System.out.println("C");
	}
	else
	{
		System.out.println("hi");
	}
	
	

	
	
	
	
	
	
}
}
