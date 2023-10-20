package Task1;

public class Task1_3 {
	public static int[][] tich(int[][] a, int[][] b) {
		int rowsA = a.length;
		int colsA = a[0].length;
		int colsB = b[0].length;
		if (colsA != b.length) {
		}
		int[][] result = new int[rowsA][colsB];
		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < colsB; j++) {
				for (int k = 0; k < colsA; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] matrixA = { { 2, 3 }, { 4, 5 } };
		int[][] matrixB = { { 6, 7 }, { 8, 9 } };
		int[][] result = tich(matrixA, matrixB);
		System.out.println("Tich cua hai ma tran tren la:");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
