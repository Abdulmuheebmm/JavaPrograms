

package Recurssion;

public class RecurssionSumOfNatural {
	
	public static void main(String[] args) {
		int n=10;
	  System.out.println(sum(10));
	}
	
	
static int sum(int n)
{
	if(n<=1)
	{
		return n;
	}
	else
	{
		return n+sum(n-1);
	}
	
}

}
