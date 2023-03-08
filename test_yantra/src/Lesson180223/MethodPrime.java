package Lesson180223;

public class MethodPrime {
	
	static boolean isPrime(int x)
	{
		boolean flag=true;
		int temp=0;
	for(int i=2;i<x;i++)
	{
		if(x%i==0)
		{
			temp=temp+1;
		}
	}
	if(temp>0)
	{
	return flag=false;
	}
	else{
		return flag=true;
	}
		
	}
	
	
	
public static void main(String[] args) {
	
	System.out.println(isPrime(7));
}
}
