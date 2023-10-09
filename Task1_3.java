package Lab3_Task1;

public class Task1_3 {
	private int[] array;

	public void MyArray(int[] array) {
		this.array = array;
	}

	public int iterativeBinarySearch(int target) {
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] > target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public int recursiveBinarySearch(int target) {
		return recursiveBinarySearchHelper(target, 0, array.length - 1);
	}

	private int recursiveBinarySearchHelper(int target, int left, int right) {
		if (left > right) {
			return -1;
		}
		int mid = left + (right - left) / 2;
		if (array[mid] == target) {
			return mid;
		} else if (array[mid] > target) {
			return recursiveBinarySearchHelper(target, mid + 1, right);
		} else {
			return recursiveBinarySearchHelper(target, left, mid - 1);
		}
	}

	public static void main(String[] args) {
		int[] array = { 50, 45, 45, 12, 10, 10, 9, 2 };
		MyArray myArray = new MyArray(array);

		int target1 = 45;
		int target2 = 15;
		int result1 = myArray.iterativeLinearSearch(target1);
		int result2 = myArray.iterativeLinearSearch(target2);
		System.out.println("Iterative Binary Search - Target 1: " + result1);
		System.out.println("Iterative Binary Search - Target 2: " + result2);
		int result3 = myArray.recursiveLinearSearch(target1);
		int result4 = myArray.recursiveLinearSearch(target2);
		System.out.println("Recursive Binary Search - Target 1: " + result3);
		System.out.println("Recursive Binary Search - Target 2: " + result4);
	}
}
