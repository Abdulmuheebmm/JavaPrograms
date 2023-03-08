package Lesson280223Assignmer;

public class StringtoChararray {
public static void main(String[] args) {
	String str="abdul";
	
	char []s=new char[str.length()];
	char ch;
	for(int i=0;i<s.length;i++)
	{
		ch=str.charAt(i);
		s[i]=ch;
	}
	
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
}
}
