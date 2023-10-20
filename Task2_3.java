package Task2;

public class Task2_3 {
	public boolean checkDiagonals(char[][] board) {
		char topLeftToBottomRight = board[0][0];
		if (topLeftToBottomRight != ' ' && topLeftToBottomRight == board[1][1] && topLeftToBottomRight == board[2][2]) {
			return true;
		}
		char bottomLeftToTopRight = board[2][0];
		if (bottomLeftToTopRight != ' ' && bottomLeftToTopRight == board[1][1] && bottomLeftToTopRight == board[0][2]) {
			return true;
		}

		return false;
	}
	public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {'X', 'X', 'O'}
        };

        Task2_3 task = new Task2_3();
        boolean diagonalWin = task.checkDiagonals(board);

        if (diagonalWin) {
            System.out.println("Co nguoi choi chien thang");
        } else {
            System.out.println("Khong co nguoi choi nao chien thang");
        }
    }
}
