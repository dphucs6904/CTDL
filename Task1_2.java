package Lab3_Task1;

public class Task1_2 {
	    private int[] array;

	    public void MyArray(int[] array) {
	        this.array = array;
	    }

	    // Iterative Binary Search (Assumes the array is sorted in ascending order)
	    public int iterativeBinarySearch(int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                return mid; // Found the target, return its index
	            } else if (array[mid] < target) {
	                left = mid + 1; // Search the right half
	            } else {
	                right = mid - 1; // Search the left half
	            }
	        }

	        return -1; // Target not found in the sorted array
	    }

	    // Recursive Binary Search (Assumes the array is sorted in ascending order)
	    public int recursiveBinarySearch(int target) {
	        return recursiveBinarySearchHelper(target, 0, array.length - 1);
	    }

	    private int recursiveBinarySearchHelper(int target, int left, int right) {
	        if (left > right) {
	            return -1; // Target not found in the sorted array
	        }

	        int mid = left + (right - left) / 2;

	        if (array[mid] == target) {
	            return mid; // Found the target, return its index
	        } else if (array[mid] < target) {
	            return recursiveBinarySearchHelper(target, mid + 1, right); // Search the right half
	        } else {
	            return recursiveBinarySearchHelper(target, left, mid - 1); // Search the left half
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {2, 9, 10, 10, 12, 45, 45, 50};
	        MyArray myArray = new MyArray(array);

	        int target1 = 45;
	        int target2 = 15;

	        // Test iterativeBinarySearch
	        int result1 = myArray.iterativeLinearSearch(target1);
	        int result2 = myArray.iterativeLinearSearch(target2);
	        System.out.println("Iterative Binary Search - Target 1: " + result1); // Output: 5
	        System.out.println("Iterative Binary Search - Target 2: " + result2); // Output: -1

	        // Test recursiveBinarySearch
	        int result3 = myArray.recursiveLinearSearch(target1);
	        int result4 = myArray.recursiveLinearSearch(target2);
	        System.out.println("Recursive Binary Search - Target 1: " + result3); // Output: 5
	        System.out.println("Recursive Binary Search - Target 2: " + result4); // Output: -1
	    }
	}


