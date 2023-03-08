package programming;

public class Product {
public static void main(String[] args) {
	int no=1456;
	int sum=0;
	
	
	while(no!=0)
	{
		int rem=no%10;
		sum=sum+rem;
		no=no/10;
		
	}
	System.out.println(sum);

}
}
