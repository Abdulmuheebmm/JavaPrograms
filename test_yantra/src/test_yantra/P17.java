package test_yantra;

import java.util.Scanner;

public class P17 {
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the run");
	int run=sc.nextInt();
	
	if(run>1 && run<=25)
	{
		System.out.println("bad performance");
	}
	else if(run>25 && run<50)
	{
		System.out.println("good performance");
	}
	else if(run>=50 && run <=80)
	{
		System.out.println("very good performance");
	}
	else
	{
		System.out.println("amezing performance");
	}
}


}
