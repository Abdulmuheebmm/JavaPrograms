import java.util.Scanner;

public class findXelementIn2DArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("ENTER THE ROW SIZE");
	int row=sc.nextInt();
	System.out.println("ENTER THE column SIZE");
	int column=sc.nextInt();
	
	int [][] a=new int[row][column];
	
	for(int i=0;i<row;i++)
	{
		System.out.println("enter elements");
		for(int j=0;j<column;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}

	int sum=0;
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
			 sum = sum+a[i][j];
		}
	}
	System.out.println(sum);
	
	
	
	
	
	
	
//	for(int i=0;i<row;i++)
//	{
//
//		for(int j=0;j<column;j++)
//		{
//			System.out.print(a[i][j]+ " ");
//		}
//		System.out.println();
//	}
	
	
	
	
	
	
	
	
}
}
