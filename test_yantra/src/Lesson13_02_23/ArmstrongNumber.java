package Lesson13_02_23;

public class ArmstrongNumber {
public static void main(String[] args) {
	int no=153;
	int cpy=no;
	int cppy=no;
	int count=0;
	int sum=0;
	while(no>0)
	{
		int rem=no%10;
		count=count+1;
		
		no=no/10;
		
	
	}
	
while(cpy>0)
{
	int r=cpy%10;
	int pow=1;
	int pow=count*pow;
	sum=sum+powe;
	cpy=cpy/10;
}

if(sum==cppy)
{
	System.out.println("armstrong");
}
else
{
	System.out.println("not a armstrong");
}
	
	
}
}
