package Task2;

public class Task2_2 {
	public boolean checkColumns(char[][] board) {
	    for (int col = 0; col < 3; col++) {
	        if (board[0][col] != ' ' && board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
	            return true; 
	        }
	    }
	    return false;
	}
	public static void main(String[] args) {
        char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'X', 'O'},
            {'X', 'O', 'X'}
        };

        Task2_2 game = new Task2_2();
        boolean result = game.checkColumns(board);

        if (result) {
            System.out.println("Co cot giong nhau");
        } else {
            System.out.println("Khong co cot nao giong nhau");
        }
    }
}
