package lesson220223;

public class MergeArray {
public static void main(String[] args) {
	
	int a[]={1,1,1,1};
	int b[]={0,0,0,0,0};
	
	int [] c =new int [a.length + b.length];
	int k=0;
	for(int i=0;i<c.length;i++)
	{
		if(i<a.length)
		{
			c[i]=a[i];
		}
		else
		{
			c[i]=b[k];
			k++;
		}
	}
	
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]);
	}
	
	
	
}
}
