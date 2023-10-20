package Task1;

public class Task1_4 {
	public static int[][] chuyendoi(int[][] a) {
		if (a == null || a.length == 0 || a[0].length == 0) {
			return new int[0][0];
		}
		int numRows = a.length;
		int numCols = a[0].length;
		int[][] result = new int[numCols][numRows];
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				result[j][i] = a[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] originalMatrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Ma tran ban dau:");
		printMatrix(originalMatrix);
		int[][] transposedMatrix = chuyendoi(originalMatrix);
		System.out.println("Ma tran chuyen doi:");
		printMatrix(transposedMatrix);
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}
