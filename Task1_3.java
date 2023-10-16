package Task1;

public class Task1_3 {
	public static void insertionSort(int[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			int key = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] < key) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Mang truoc khi sap xep:");
		for (int num : array) {
			System.out.println(num);
		}
		insertionSort(array);
		System.out.println("Mang sau khi sap xep:");
		for (int num : array) {
			System.out.println(num);
		}

	}
}
