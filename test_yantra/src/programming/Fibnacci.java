package programming;

public class Fibnacci {
public static void main(String[] args) {
	
	int f1=0;
	int f2=1;
	int temp=0;
	int i=1;
	while(i<=3)
	{
		temp=f1+f2;
		f1=f2;
		f2=temp;
		i++;
	}
	System.out.println(temp);
}
}
