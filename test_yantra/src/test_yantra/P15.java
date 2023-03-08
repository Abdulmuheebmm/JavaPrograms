package test_yantra;

import java.util.Scanner;

public class P15 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the character");
char c=sc.next().charAt(0);
	
	if(c == 'A'|| c=='E'||c== 'I'|| c=='O'||c=='U' || c == 'a'|| c=='e'||c== 'i'|| c=='o'||c=='u' )
	{
		System.out.println("vowels");
	}
	else if(c>=0 && c<=9)
	{
		System.out.println("number");
	}
	
	else
	{
		System.out.println("consonants");
	}
}
}
