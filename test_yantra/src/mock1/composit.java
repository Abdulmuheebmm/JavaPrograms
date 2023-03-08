package mock1;

public class composit {
public static void main(String[] args) {
	int no=15;
	boolean flag=false;
	for(int i=2;i<no;i++)
	{
		if(no%i==0)
		{
			flag=true;
		}
	}
	
	if(flag == true)
	{
		System.out.println("composit");
	}
	else
	{
		System.out.println("not a composit");
	}
}
}
