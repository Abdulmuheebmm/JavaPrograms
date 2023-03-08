package Lesson13_02_23;

public class SwapWithou3rd {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a value is "+a+"     "+"b value is "+b);
}
}
