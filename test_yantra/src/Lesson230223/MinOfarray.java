package Lesson230223;

public class MinOfarray {
	public static void main(String[] args) {
		int a[]={4,8,2,3,8};
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
