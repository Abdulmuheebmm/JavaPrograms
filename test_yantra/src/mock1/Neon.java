package mock1;

public class Neon {
	public static void main(String[] args) {
		int no=2;
		boolean flag=true;
		int sq=no*no;
		
		while (no>0)
		{
			if(no%10==sq%10)
			{
				no=no/10;
				sq=sq/10;
				flag=true;
				
			}
			else{
				flag=false;
				break;
			}
		
		}
		if(flag==true)
		{
			System.out.println("it is neon");
		}
		else
		{
			System.out.println("not a neon number");
		}
	}
}
