package Lesson180223;

public class ReturnFact {

	static long factorial(int x)
	{
		int fact =1;
		for(int i=1;i<=x;i++)
		{
			fact=fact*i;
			
		}
		return fact;

	}
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
}
