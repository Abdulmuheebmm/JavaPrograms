package Assignment1;

import java.util.Scanner;

public class Discount10P {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("===============buy 5 t-sherts get 10% discount per-t-shert 200==============\n\n\nENTER THE NUMBER OF T SHERTS ");
		int t=sc.nextInt();
		
		if(t>5)
		{
			int amount=t*200;
			int discount=amount*10/100;
			System.out.println(" amount is"+amount);
			System.out.println("discount is "+discount);
			int total=amount-discount;
			System.out.println("total amount"+total);
		}
		else
		{
			System.out.println("total amount  "+t*200+"   YOUR NOT ELIGIBLE FOR DISCOUNT");
		}
	}
}
