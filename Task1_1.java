package Task1;

public class Task1_1 {
	public static void selectionSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			int max_idx = i;

			for (int j = i + 1; j < n; j++)
				if (array[j] > array[max_idx])
					max_idx = j;

			int temp = array[max_idx];
			array[max_idx] = array[i];
			array[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 3, 6 };
		System.out.println("Mang truoc khi sap xep:");
		for (int num : array) {
			System.out.println(num);
		}
		selectionSort(array);
		System.out.println("Mang sau khi sap xep:");
		for (int num : array) {
			System.out.println(num);
		}
	}
}
