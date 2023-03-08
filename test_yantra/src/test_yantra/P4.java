package test_yantra;

import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter tha side of square");
		double said=sc.nextDouble();
		
		double result =said*said;
		
		double result1=4*said;
		System.out.println("area of the square "+result);
		System.out.println("perimeter of the square "+result1);
	}
}
