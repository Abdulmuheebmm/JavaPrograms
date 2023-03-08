package Lesson170223;

public class holov {
public static void main(String[] args) {
	
		
	int n=5;
	
	for(int r=5;r>=1;r--)
	{char c='A';
		
		for(int j=1;j<=n-r;j++)
		{
			System.out.print("  ");
		}
		for(int k=1;k<=2*r-1;k++)
		{
			if(r==k||k==k-r*2)
			{
				System.out.print("c");
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
