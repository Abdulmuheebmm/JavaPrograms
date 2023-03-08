package Lesson170223;

public class pattrenRV {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");	
		}
		System.out.println();
	}
	
	for(int k=n-1;k>=1;k--)
	{
		for(int j=k;j>=1;j)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
