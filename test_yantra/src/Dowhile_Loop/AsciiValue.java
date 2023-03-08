package Dowhile_Loop;

public class AsciiValue {
public static void main(String[] args) {
	
	char c='A';
	do{
		int b=c;
		System.out.println(c+"="+b);
		c++;
		}
	while(c<='Z');
}
}
