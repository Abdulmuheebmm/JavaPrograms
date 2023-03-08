package Lesson170223;

public class pattren0 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i+j==n+1 && i==j)
			{
				System.out.print("#");
			}
		else if(i==n/2+1||j==n/2+1)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
