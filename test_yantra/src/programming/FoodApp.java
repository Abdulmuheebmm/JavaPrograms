package programming;

import java.util.Scanner;

public class FoodApp {
	static Scanner sc=new Scanner(System.in);
	static FoodApp f=new FoodApp();
	
	String name;
	String email;
	long number;
	String password;
	
	
	
	
	void creatAccount(String name,String email,long number,String password)
	{
		this.name=name;
		this.email=email;
		this.number=number;
		this.password=password;
		System.out.println("ACCOUNT IS CREATED SUCCESSFULL");
		
		
		
		
		
		
		
		System.out.println("enter the name");
		String a=sc.nextLine();
		System.out.println("enter the password");
		String b=sc.nextLine();
	f.login(a,b);
	}
	
	
	void login(String email,String password)
	{


if(email.equals(this.email) && password.equals(this.password))
{
	System.out.println("**************RESTURENTS****************");
	System.out.println("1.albaik\n2.udupi upahara\n3.kapurs cefe\4.nmane ruchi\n5five star chicken");
	int opt=sc.nextInt();
	
	switch(opt)
	{
	case(1):
	{
		System.out.println("WELCOME TO UDUPI UPAHARA");
		System.out.println("============FOOD============\n1.beryani\n2.chicken kaba\n3.butter panner\n4.pizza\n5.burger");
		int in=sc.nextInt();
		switch(in)
		{
		case(1):
		{
			System.out.println("beryani price is 270");
			break;
		}
		
		case(2):
		{
			System.out.println("chicken kaba price is 150");
			break;
		}
		
		case(3):
		{
			System.out.println("butter panner price is 130");
			break;
		}
		
		
		}
	}
	}
}
else
{
	System.out.println("invalid user name and password");
}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {

		
		
		System.out.println("===========WELCOM TO ZOMATO===========");
		System.out.println("1:CREAT NEW ACCOUNT \n2:LOG IN\n");
		int inp=sc.nextInt();
		
		switch(inp)
		{
		case 1:
		{
			System.out.println("ENTER THE NAME");
			String name=sc.next();
			System.out.println("ENTER THE EMAIL");
			String email=sc.next();
			System.out.println("ENTER THE number");
			long number=sc.nextLong();
			System.out.println("ENTER THE PASSWORD");
			String password=sc.next();
			f.creatAccount(name,email,number,password);
			
			
		
			break;
		}
		case 2:
		{
			

			
		}
		
		}
		
	}

}






















