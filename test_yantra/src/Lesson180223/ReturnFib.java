package Lesson180223;

public class ReturnFib {
	static void fib(int x) {
		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println(a);
		System.out.println(b);

		for (int i = 1; i < x; i++) {

			c = a + b;

			a = b;
			b = c;

			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		fib(10);
	}
}
