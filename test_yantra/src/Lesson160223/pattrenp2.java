package Lesson160223;

public class pattrenp2 {
		public static void main(String[] args) {
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("  ");
				}
				for(int t=4;t>=i;t--)
				{
					System.out.print("* ");
				}
				for(int v=i;v<=4;v++)
				{
					System.out.print("* ");
				}
				for(int r1=1;r1<=i;r1++)
				{
					System.out.print("  ");
				}
			
				System.out.println();
			}
			
			for(int i=1;i<=4;i++)
			{
				for(int j=4;j>=i;j--)
				{
					System.out.print("  ");
				}
				
				for(int s=1;s<=i;s++)
				{
					System.out.print("* ");
				}
				
				for(int s1=1;s1<=i;s1++)
				{
					System.out.print("* ");
				}
				for(int x=4;x>=i;x--)
				{
					System.out.print("  ");
				}
				System.out.println();
			}
			
			
			

		}
}

