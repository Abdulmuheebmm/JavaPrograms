package Lesson230223;

public class ArrayPalandrome {
public static void main(String[] args) {
	
	int a[]={12,121,45,51};
	


	boolean flag=false;
	for( int i=0;i<a.length;i++)
	{
		int n=a[i];
		int cpy=n;
		int rev=0;
		while(n!=0)
		{
		
			rev=rev*10+n%10;
			n=n/10;
		}
		if(cpy==rev)
		{
			flag=true;
		}
		
	}
	if(flag)
	{
		System.out.println("palandrome ");
	}
	else
	{
		System.out.println("not a palandrome");
	}
	
	
}
}
