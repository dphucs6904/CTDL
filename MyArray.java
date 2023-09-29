package Lab1_Task1;

import java.util.Arrays;

public class MyArray {

	    private int[] array;

	    public MyArray(int[] array) {
	        this.array = array;
	    }

	    // Method to reverse the array like a mirror
	    public int[] mirror() {
	        int[] mirroredArray = new int[array.length * 2];
	        int j = array.length - 1;

	        for (int i = 0; i < array.length; i++) {
	            mirroredArray[i] = array[i];
	            mirroredArray[j] = array[i];
	            j--;
	        }

	        return mirroredArray;
	    }

	    // Method to remove duplicate elements and return a new array
	    public int[] removeDuplicates() {
	        int[] uniqueArray = new int[array.length];
	        int count = 0;

	        for (int i = 0; i < array.length; i++) {
	            boolean isDuplicate = false;

	            for (int j = 0; j < count; j++) {
	                if (array[i] == uniqueArray[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (!isDuplicate) {
	                uniqueArray[count] = array[i];
	                count++;
	            }
	        }

	        return Arrays.copyOf(uniqueArray, count);
	    }

	    public static void main(String[] args) {
	        int[] inputArray = {1, 3, 5, 1, 3, 7, 9, 8};
	        MyArray myArray = new MyArray(inputArray);

	        int[] mirroredResult = myArray.mirror();
	        System.out.println("Mirror result: " + Arrays.toString(mirroredResult));

	        int[] uniqueResult = myArray.removeDuplicates();
	        System.out.println("Remove duplicates result: " + Arrays.toString(uniqueResult));
	    }
	}
