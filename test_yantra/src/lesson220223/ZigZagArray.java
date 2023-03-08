package lesson220223;

public class ZigZagArray {
public static void main(String[] args) {
	
	int a[]={1,1,1,1};
	int b[]={0,0,0,0,0};
	
	int [] c =new int [a.length + b.length];
	
	int j=0;
	int k=0;
	
	for(int i=0;i<c.length;)
	{
		
		
			if(j<a.length)
			{
				c[i]=a[j];
				
				j++;
				i++;
			}
			if(k<b.length)
			{
				c[i]=b[k];
				i++ ;
				k++;
			}
		
			
		
		
	}
	
	for(int i=0;i<c.length;i++)
	{
		System.out.print(c[i]);
	}
	
	
	
}
}
