package Lesson170223;

public class characterpattren {
public static void main(String[] args) {
	int n=5;
	int x=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if((j==1||j==n || j==x ||j==n-x+1)&&i<=n/2+1)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		x++;
		System.out.println();
	}
}
}
