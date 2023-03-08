package Lesson180223;

public class ReturnType {
public static void main(String[] args) 
{
	
	
	System.out.println(add(20,40));
	System.out.println(add(20.0d,30.56d));
	System.out.println(add(50l,60l));
	System.out.println(add('a','b'));
	
//	System.out.println(add("hello","hi");
}

static int add(double a,double b)
{
	double c=a+b;
	return (int)c;
}
}
