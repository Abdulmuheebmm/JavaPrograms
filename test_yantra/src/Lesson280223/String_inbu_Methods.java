package Lesson280223;

public class String_inbu_Methods {
public static void main(String[] args) {
	
	String s="chitradurga";
	
	System.out.println(s);
	System.out.println("========================================");
	System.out.println(s.length());
	System.out.println("========================================");
	System.out.println(s.toUpperCase());
	System.out.println("========================================");
	System.out.println(s.toLowerCase());
	System.out.println("========================================");
	System.out.println(s.startsWith("chit"));
	System.out.println(s.startsWith("a"));
	System.out.println("========================================");
	System.out.println(s.endsWith("ga"));
	System.out.println(s.endsWith("e"));
	System.out.println("========================================");
	System.out.println(s.concat("a"));
	System.out.println(s.contains("x"));
	System.out.println("========================================");
	System.out.println(s.concat(" kote naadu"));
	System.out.println("========================================");
	System.out.println(s.charAt(9));
	System.out.println("========================================");
	System.out.println(s.indexOf("d"));
}
}
