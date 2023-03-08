package Lesson160223;

public class Happynumber {
public static void main(String[] args) {
	int no=4;
	int sum=0;
	int rem=0;
			int rem1=0;
	
	
		while(true)
		{
			sum=0;
		while(no!=0)
		{
			
			rem=no%10;
			int prod=rem*rem;
			sum=sum+prod;
			no=no/10;
		}
		
		no=sum;
		if(no==1)
		{
			System.out.println("happy num");
			break;
		}
		else if(no==4)
		{
			System.out.println("sad number");
			break;
		}
		
	
		}
	System.out.println(no);
	
}
}
