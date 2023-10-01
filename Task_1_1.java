package Lab2_Task1;

public class Task_1_1 {
	public static int getSn1(int n) {
		if (n == 1) {
			return 1;
		} else if (n % 2 == 0) {
			return -n + getSn1(n - 1);
		} else {
			return n + getSn1(n - 1);
		}
	}

	public static int getSn2(int n) {
		if (n == 1) {
			return 1;
		} else {
			return getSn2(n - 1) + factorial(n);
		}
	}

	private static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static int getSn3(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * n + getSn3(n - 1);
		}
	}

	public static double getSn4(int n) {
		if (n == 0) {
			return 1.0;
		} else {
			double denominator = 1.0;
			for (int i = 1; i <= 2 * n; i += 2) {
				denominator *= i;
			}
			return 1.0 / denominator + getSn4(n - 1);
		}
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println("S(" + n + ") = " + getSn1(n));
		System.out.println("S(" + n + ") = " + getSn2(n));
		System.out.println("S(" + n + ") = " + getSn3(n));
		System.out.println("S(" + n + ") = " + getSn4(n));
	}
}
