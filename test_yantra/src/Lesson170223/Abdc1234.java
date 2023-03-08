package Lesson170223;

public class Abdc1234 {
public static void main(String[] args) {
	int n=5;
	char x='a';
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==j)
			{
				System.out.print(x+" ");
				x++;
			}
			else
			{
				System.out.print(i+j+" ");
			}
		}
		System.out.println();
	}
}
}
