package Lesson230223;

public class ArrayElementsNotPresent {
public static void main(String[] args) {
	int a[]={1,2,3,4,5,5};
	int b[]={1,2,3,3,2,5};
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			{
				System.out.println("present"+a[i]);
			}
			
		}
	}
}
}
