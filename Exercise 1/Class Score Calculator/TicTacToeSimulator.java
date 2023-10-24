import java.util.Arrays;

public class TicTacToeSimulator {
    public static void main(String[] args) {
        // Create a 3x3 Tic-Tac-Toe board
        String[][] board = {
                {"X", "O", "X"},
                {"O", "X", "O"},
                {"X", "O", "X"}
        };

        // Print the board
        printBoard(board);

        // Check for a winner
        String winner = checkForWinner(board);
        if (winner != null) {
            System.out.println("Winner: " + winner);
        } else {
            System.out.println("It's a draw!");
        }
    }

    // Function to print the Tic-Tac-Toe board
    public static void printBoard(String[][] board) {
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Function to check for a winner in Tic-Tac-Toe
    public static String checkForWinner(String[][] board) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return board[i][0];  // Row i is the same
            }
            if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                return board[0][i];  // Column i is the same
            }
        }
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
            return board[0][0];  // Diagonal from top-left to bottom-right
        }
        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return board[0][2];  // Diagonal from top-right to bottom-left
        }

        return null;  // No winner yet
    }
}
