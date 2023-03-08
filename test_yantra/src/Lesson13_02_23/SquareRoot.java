package Lesson13_02_23;

public class SquareRoot {
public static void main(String[] args) {
	int no= 17;
	boolean flag=true;
	for(int i=1;i<=no;i++)
	{
		if(i*i==no)
		{
			System.out.println("Square root");
		}
	
	}
	if(flag==false)
	{
		System.out.println("not a square");
	}
	
	
}
}
