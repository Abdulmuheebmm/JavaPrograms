package Lesson170223;

public class pyramid {
	public static void main(String[] args) {

		int n=5;
		int count=1;
	
		for(int r=1;r<=n;r++)
		{
			
			for(int j=1;j<=n-r;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*r-1;k++)
			{
				System.out.print(r%2 +" ");
				count++;
				
			}
			
			System.out.println();
		}
}
}
