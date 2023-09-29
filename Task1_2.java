package Lab1_Task1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task1_2 {
	private int[] array;

	public void MyArray(int[] array) {
		this.array = array;
	}

	public int[] getMissingValues() {
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		return IntStream.range(min, max + 1).filter(i -> Arrays.binarySearch(array, i) < 0).toArray();
	}

	public int[] fillMissingValues(int k) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1 && i >= k && i < array.length - k) {
				int sum = 0;
				for (int j = i - k; j <= i + k; j++) {
					sum += array[j];
				}
				array[i] = sum / (2 * k + 1);
			}
		}
		return array;
	}

}

