package Lesson170223;

public class pyramid1212321 {
	public static void main(String[] args) {

		int n=5;

	
		for(int r=1;r<=n;r++)
		{		
			
			int count=1;
			
			for(int j=1;j<=n-r;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=2*r-1;k++)
			{
			if(k<r)
			{
				System.out.print(count++ +" ");
			}
			else{
				System.out.print(count--+" ");
			}
				
				
			}
			
			System.out.println();
		}
}
}
