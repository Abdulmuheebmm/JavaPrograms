package Dowhile_Loop;

public class SumOfFirst10Even {
public static void main(String[] args) {
	
	int sum=0;
	int i=1;
	do
	{
		if(i%2==0)
		{
			sum=sum+i;
			
		}
		
		i++;
	}while(i<=10);
	System.out.println(sum);
}
}
