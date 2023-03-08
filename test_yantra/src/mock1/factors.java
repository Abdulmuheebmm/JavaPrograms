package mock1;

public class factors {
public static void main(String[] args) {
	int no=6;
	int sum=0;
	for(int i=1;i<=6;i++)
	{
		if(no%i==0)
		{
			sum=sum+i;
		}
	
	
	}
	System.out.println(sum);
}
}
