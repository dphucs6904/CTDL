package Task1;

public class Task1_1 {
	public static int[][] tong(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			throw new IllegalArgumentException();
		}
		int rows = a.length;
		int columns = a[0].length;
		int[][] result = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixB = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };
		int[][] result = tong(matrixA, matrixB);
		System.out.println("Tong cua hai ma tran tren la:");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
