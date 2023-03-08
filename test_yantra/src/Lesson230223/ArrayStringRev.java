package Lesson230223;

public class ArrayStringRev {
public static void main(String[] args) {
	char a[]={'a','b','c','d'};
	char []cp=new char[a.length];
	
	int i=0;
	int j=a.length-1;
	char temp=0;
			while(i<j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;	
			}
			
			for( i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
				cp=a;
			}
			
		
		
	

	
}
}
