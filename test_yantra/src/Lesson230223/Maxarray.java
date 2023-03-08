package Lesson230223;

public class Maxarray {
public static void main(String[] args) {
	int a[]={4,1,2,3,8};
	int max=a[0];
	int second=a[0];
	int th=a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
			
		{	

			second =max;
			max=a[i];
		}
	}
	System.out.println(max);
	System.out.println(second);
	
}
}
