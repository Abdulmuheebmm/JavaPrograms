package Lesson140223;

public class pattren111 {
	public static void main(String[] args) {
		int n=5;
		
		
		for(int i=1;i<=n;i++)
		{int y=n;
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(y);
				y--;
				
			}
			
			
			System.out.println();
		}
		
	}
}
