package lesson220223;

public class CommonArray {
public static void main(String[] args) {

	int a[]={12,11,3,4,6,7,8};
	int b[]={10,11,8,9,12};
	boolean f=false;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println(a[i]);
			
			}
			
		
		}
	}
	

	
	
}
}
