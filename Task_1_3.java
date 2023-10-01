package Lab2_Task1;

public class Task_1_3 {
	public class PascalTriangle {
	    public static void main(String[] args) {
	        int rows = 5; 
	        printPascalTriangle(rows);
	    }

	    public static void printPascalTriangle(int rows) {
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 0; j < rows - i; j++) {
	                System.out.print("   "); 
	            }
	            int[] row = getPascalTriangle(i);
	            for (int num : row) {
	                System.out.printf("%4d", num); 
	            }
	            System.out.println(); 
	        }
	    }

	    public static int[] getPascalTriangle(int n) {
	        if (n == 1) {
	            int[] row = {1};
	            return row;
	        } else {
	            int[] prevRow = getPascalTriangle(n - 1);
	            return generateNextRow(prevRow);
	        }
	    }

	    public static int[] generateNextRow(int[] prevRow) {
	        int[] nextRow = new int[prevRow.length + 1];
	        nextRow[0] = 1;
	        nextRow[nextRow.length - 1] = 1;
	        for (int i = 1; i < nextRow.length - 1; i++) {
	            nextRow[i] = prevRow[i - 1] + prevRow[i];
	        }
	        return nextRow;
	    }
	}
}