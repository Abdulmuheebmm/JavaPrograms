package Recurssion;

public class Print_recurssion {

	static void print( int count)
	{
		if(count<=1)
		{
			return;
		}
		else
		{
			System.out.println("welcome to test yantra");
			print(count-1);
		}
	}
	public static void main(String[] args) {
		print(6);
	}
	
}
