package Lab3_Task1;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	public int iterativeLinearSearch(int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public int recursiveLinearSearch(int target) {
		return recursiveLinearSearchHelper(target, 0);
	}

	private int recursiveLinearSearchHelper(int target, int index) {
		if (index >= array.length) {
			return -1;
		}
		if (array[index] == target) {
			return index;
		}
		return recursiveLinearSearchHelper(target, index + 1);
	}

	public static void main(String[] args) {
		int[] array = { 12, 10, 9, 45, 2, 10, 10, 45 };
		MyArray myArray = new MyArray(array);
		int target1 = 45;
		int target2 = 15;
		int result1 = myArray.iterativeLinearSearch(target1);
		int result2 = myArray.iterativeLinearSearch(target2);
		System.out.println("Iterative Search - Target 1: " + result1);
		System.out.println("Iterative Search - Target 2: " + result2);
		int result3 = myArray.recursiveLinearSearch(target1);
		int result4 = myArray.recursiveLinearSearch(target2);
		System.out.println("Recursive Search - Target 1: " + result3);
		System.out.println("Recursive Search - Target 2: " + result4);
	}
}
