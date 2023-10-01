package Lab2_Task1;

public class Task_1_2 {
	public static int getFibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return getFibonacci(n - 1) + getFibonacci(n - 2);
		}
	}

	public static void printFibonacci(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(getFibonacci(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int n = 10; 
		System.out.println("Fibonacci("+n+") la:");
		printFibonacci(n);
	}
}
