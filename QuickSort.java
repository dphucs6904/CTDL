package Task2;

public class QuickSort {
	public static void quickSort(int[] array) {
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int pivot = getPivot_MedianOfThree(array, left, right);
			int partitionIndex = partition(array, left, right, pivot);
			quickSort(array, left, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, right);
		}
	}

	private static int partition(int[] array, int left, int right, int pivot) {
		int pivotValue = array[pivot];
		swap(array, pivot, right);
		int i = left;
		for (int j = left; j < right; j++) {
			if (array[j] < pivotValue) {
				swap(array, i, j);
				i++;
			}
		}
		swap(array, i, right);
		return i;
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static int getPivot_MedianOfThree(int[] array, int left, int right) {
		int mid = (left + right) / 2;
		if (array[left] > array[mid]) {
			swap(array, left, mid);
		}
		if (array[left] > array[right]) {
			swap(array, left, right);
		}
		if (array[mid] > array[right]) {
			swap(array, mid, right);
		}
		return mid;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 1, 3, 8, 4, 2, 9, 7, 5 };
		quickSort(arr);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
