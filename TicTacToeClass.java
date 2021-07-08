package tts.tic.tac.toe;

public class TicTacToeClass {
	// Instance Variables
	private char[][] board;
	private int turns;

	// Constructors
	public TicTacToeClass() {
		board = new char[3][3];
		turns = 0;

		for (int r = 0; r < 3; r++)
			for (int c = 0; c < 3; c++)
				board[r][c] = ' ';
	}

	// Accessor Methods

	public boolean isWinner(char p) {

		for (int i = 0; i < 3; i++) {
			// check row winner
			if (board[i][0] == p && board[i][1] == p && board[i][2] == p) {
				return true;
			// check row winner
			} else if (board[0][i] == p && board[1][i] == p && board[2][i] == p) {
				return true;
			}
		}

		// check diagonals winner
		if (board[0][0] == p && board[1][1] == p && board[2][2] == p) {
			return true;
		}
		// check diagonals winner
		if (board[0][2] == p && board[1][1] == p && board[2][0] == p) {
			return true;
		}

		return false;
	}

	public boolean isFull() {
		for (int r =0; r < 3; r++) {
			for (int c =0; c < 3; c++) {
				if(board[r][c] != 'X' && board[r][c] != 'O') {
					return false;
				} 
			}
		}
		return true;
	}

	public boolean isCat() {
		if(isFull() == true) {
			return true;
		}
		
		return false;
	}

	public boolean isValid(int r, int c) {
		if (0 <= r && r <= 2 && 0 <= c && c <= 2)
			return true;
		else
			return false;
	}

	public int numTurns() {
		return turns;
	}

	public char playerAt(int r, int c) {
		if (isValid(r, c))
			return board[r][c];
		else
			return '@';
	}

	public void displayBoard() {
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}

	// Modifiers
	public void playMove(char p, int r, int c) {
		board[r][c] = p;
	}

}