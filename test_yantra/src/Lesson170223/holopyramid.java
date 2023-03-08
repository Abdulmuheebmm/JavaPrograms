package Lesson170223;

public class holopyramid {
	public static void main(String[] args) {
		int n=5;
		for(int r=n;r>=1;r--)
		{
			for(int j=1;j<=n-r;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*r-1;k++)
			{
				if(k==1||k==r*2-1)
				{
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
