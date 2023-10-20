package Task2;

public class Task2_1 {
	 private char[][] board;
	    public boolean checkRows() {
	        for (int row = 0; row < board.length; row++) {
	            char firstMarker = board[row][0];
	            boolean isWin = true;
	            for (int col = 1; col < board[row].length; col++) {
	                if (board[row][col] != firstMarker) {
	                    isWin = false;
	                    break;
	                }
	            }
	            if (isWin && firstMarker != ' ') {
	                return true;
	            }
	        }
	        return false;
	    }
	    public static void main(String[] args) {
	        Task2_1 game = new Task2_1();
	        char[][] board = {
	            {'X', 'X', 'X'},
	            {' ', 'O', ' '},
	            {' ', 'O', 'O'}
	        };
	        game.board = board;
	        boolean isRowWin = game.checkRows();
	        if (isRowWin) {
	            System.out.println("Co mot hang chien thang");
	        } else {
	            System.out.println("Khong co hang nao chien thang");
	        }
	    }
}
