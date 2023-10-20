package Task2;

public class TicTacToe {
	private char[][] board;
	private int n;
	private char currentPlayer;

	public TicTacToe(int n) {
		this.n = n;
		this.board = new char[n][n];
		this.currentPlayer = 'X';
		initializeBoard();
	}

	public void initializeBoard() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = ' ';
			}
		}
	}

	public boolean makeMove(int row, int col) {
		if (row < 0 || row >= n || col < 0 || col >= n || board[row][col] != ' ') {
			return false;
		}
		board[row][col] = currentPlayer;
		currentPlayer = (currentPlayer == 'O') ? 'X' : 'O';
		return true;
	}

	public boolean checkForWin() {
		for (int i = 0; i < n; i++) {
			if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
				return true;
			}
			if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
				return true;
			}
		}
		if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			return true;
		}
		if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
			return true;
		}
		return false;
	}

	public void printBoard() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(board[i][j]);
				if (j < n - 1) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < n - 1) {
				for (int j = 0; j < n - 1; j++) {
					System.out.print("----");
				}
				System.out.println("-");
			}
		}
	}

	public static void main(String[] args) {
		TicTacToe game = new TicTacToe(3);
		game.makeMove(1, 1);
		game.makeMove(0, 0);
		game.makeMove(0, 1);
		game.makeMove(1, 0);
		game.makeMove(2, 2);
		game.makeMove(2, 0);
		game.printBoard();
		if (game.checkForWin()) {
			System.out.println("Nguoi choi chien thang");
		} else {
			System.out.println("Hai nguoi choi hoa nhau");
		}
	}
}
