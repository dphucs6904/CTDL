package Task1;

public class Task1_2 {
	public static int[][] hieu(int[][] a, int[][] b) {
		if (a.length != b.length || a[0].length != b[0].length) {
			throw new IllegalArgumentException();
		}
		int rows = a.length;
		int columns = a[0].length;
		int[][] result = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] matrixA = { { 9, 9, 9 }, { 8, 8, 8 }, { 7, 7, 7 } };
		int[][] matrixB = { { 6, 6, 6 }, { 5, 5, 5 }, { 4, 4, 4 } };
		int[][] result = hieu(matrixA, matrixB);
		System.out.println("Hieu cua hai ma tran tren la:");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
