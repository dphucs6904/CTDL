package Task2;

public class MergeSort {
	public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        int[] temp = new int[length];
        mergeSort(array, temp, 0, length - 1);
    }
    private static void mergeSort(int[] array, int[] temp, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, temp, low, middle);
            mergeSort(array, temp, middle + 1, high);
            merge(array, temp, low, middle, high);
        }
    }
    private static void merge(int[] array, int[] temp, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = array[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (temp[i] >= temp[j]) { 
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = temp[i];
            k++;
            i++;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        mergeSort(array);
        System.out.println("Mang sau khi sap xep:");
        for (int num : array) {
            System.out.print(num+ " ");
        }
    }
}
