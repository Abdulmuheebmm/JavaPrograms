package Lesson280223Assignmer;

public class ChartoStringArray {
public static void main(String[] args) {
	char[]s={'a','b','c','d'};
	String x=" ";
	for(int i=0;i<s.length;i++)	
	{
		x=x+s[i];
	}
	System.out.println(x);
}
}
