package Lesson280223Assignmer;

public class convertStringtoAsciiArray {
	public static void main(String[] args) {
		String str="abdul";
		
		int []s=new int[str.length()];
		char ch;
		for(int i=0;i<s.length;i++)
		{
			ch=str.charAt(i);
			int x=ch;
			s[i]=ch;
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
