package programming;

import java.util.Scanner;

public class Triangles_p {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENTER THE 1st SIDE OF TRIANGLE");
	int s1=sc.nextInt();
	
	System.out.println("ENTER THE 2st SIDE OF TRIANGLE");
	int s2=sc.nextInt();
	
	System.out.println("ENTER THE 3st SIDE OF TRIANGLE");
	int s3=sc.nextInt();
	
	if(s1==s2 && s1==s3 && s2==s3)
	{
		System.out.println("equilatral triangle");
	}
	
	else if(s1!=s2 && s1!=s3 && s2!=s3)
	{
		System.out.println("scalen");
	}
	
	else
	{
		System.out.println("isoceles");
	}
}
}
