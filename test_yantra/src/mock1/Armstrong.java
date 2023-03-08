package mock1;

public class Armstrong {
public static void main(String[] args) {
	int no=153;
	int count=0;
	int sum=0;
	int cpy=no;
	int cppy=no;
	while(no>0)
	{
		int rem=no%10;
		count++;
		no=no/10;
	}
	while(cpy>0)
	{
		int result=cpy%10;
		int prod=result*count;
		sum=sum+prod;
		cpy=cpy/10;
	}
 if(cppy==sum)
 {
	 System.out.println("armstrong");
 }
 else
 {
	 System.out.println("not a " );
 }
}
}
