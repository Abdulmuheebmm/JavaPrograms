package mock1;

public class perfect {
public static void main(String[] args) {
	int no=6;
	int sum=0;
	int temp=no;
	for(int i=1;i<6;i++)
	{
		if(no%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==temp)
	{
		System.out.println("perfect");
	}
	else
	{
		System.out.println("not");
	}
}
}
