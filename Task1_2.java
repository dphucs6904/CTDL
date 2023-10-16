package Task1;

public class Task1_2 {
	public static void bubbleSort(int[] array) {
		int n = array.length;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < n; i++) {
				if (array[i - 1] < array[i]) {
					int temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					swapped = true;
				}
			}
			n--;
		} while (swapped);
	}

	public static void main(String[] args) {
		int[] array = { 6, 3, 4, 2, 7, 1, 5 };
		System.out.println("Mang truoc khi sap xep:");
		for (int num : array) {
			System.out.println(num);
		}
		bubbleSort(array);
		System.out.println("Mang sau khi sap xep:");
		for (int num : array) {
			System.out.println(num);
		}
	}
}
