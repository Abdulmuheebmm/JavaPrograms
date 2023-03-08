package lesson220223;

public class powerrecursion {
	
	static int pow(int base,int pow)
	{
		if(pow<=1)
		{
			return base;
		}
		else
		{
			return base*pow(base,pow-1);
		}
	}
	
	
	
	
	
public static void main(String[] args) {
	System.out.println(pow(5,5));
}
}
