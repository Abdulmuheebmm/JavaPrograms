package lesson220223;

public class ArmstrongNumber {
public static void main(String[] args) {
	int no=135;
	int c=no;
	int cp=no;
	int count=0;
	int rem=0;
	while(no!=0)
	{
		c=c/10;
		count=count+1;
	}
	
	while(cp!=0)
	{
		rem=cp%10;
		int temp=1;
		for(int i=1;i<=count;i++)
		{
			temp=temp*rem;
		}
		cp=cp/10;
	}
	System.out.println(rem);
	
	
	
}
}
