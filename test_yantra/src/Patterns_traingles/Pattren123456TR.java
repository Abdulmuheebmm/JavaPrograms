package Patterns_traingles;

public class Pattren123456TR {
	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}
}