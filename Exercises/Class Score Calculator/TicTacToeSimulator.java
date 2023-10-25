import java.util.Arrays;

public class TicTacToeSimulator {
    public static void main(String[] args) {
        // Create a 3x3 Tic-Tac-Toe board
        String[][] board = { // initializing a 2D array named board to represent a game board hence [][]
                //This line declares a 2D array of strings named board. A 2D array is an array of arrays. In this case,
                // it's used to represent a grid-like structure where each element of the array is itself an array of strings.
                {"X", "O", "X"},
                {"O", "X", "O"},
                {"X", "O", "X"}
                //= { ... };: This is an array initialization expression. It's used to provide the initial values for the board array.
                //The array is initialized with three rows and three columns, representing a 3x3 grid. More notes below
        };

        // Print the board
        printBoard(board); //  appears to be calling the function named printBoard with the board as an argument.
        // is defined later in the code and is responsible for formatting and displaying the game board.

        // Check for a winner
        String winner = checkForWinner(board);
        //  calls the checkForWinner function, passing the board as an argument. It assigns the result to the winner variable.

        if (winner != null) { // If winner is not null, it means a player has won, and the code inside the if block will be executed.
            System.out.println("Winner: " + winner);
        } else { // If winner is null, it means there's no winner, and the code inside the else block will be executed.
            System.out.println("It's a draw! No Winner!");
        }
    }

    // Function to print the Tic-Tac-Toe board
    public static void printBoard(String[][] board) {
        // The function signature is public static void printBoard(String[][] board), indicating that it's a public,
        // static method that takes a 2D string array board as input and doesn't return any value (void).
        for (String[] row : board) {
            System.out.println(Arrays.toString(row));

            /*The function consists of a single loop that iterates over the rows of the board array.
In each iteration of the loop, the row variable takes on the value of a row from the board array, which is an array of
strings representing one row of the game board.
Arrays.toString(row) is used to convert the row array into a string representation. This representation effectively
shows the contents of the row as a comma-separated list enclosed in square brackets, similar to "[X, O, X]" for a row
with "X", "O", and "X" symbols.
System.out.println(...) is used to print the string representation of the row to the console. Each row is printed on
a separate line, creating a visual representation of the game board.
The loop continues to iterate through each row, and the result is a visual display of the entire game board, showing
the positions and moves of the players.*/

        }
    }

    // Function to check for a winner in Tic-Tac-Toe
    public static String checkForWinner(String[][] board) {
        //is public static String checkForWinner(String[][] board), indicating that it's a public, static method that
        // takes a 2D string array board as input and returns a string (either "X" or "O") representing the winning
        // player, or null if there is no winner.


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

        //The function contains nested loops to check for winning conditions in rows, columns, and diagonals on the game board
        //It uses a for loop that iterates through i from 0 to 2 (representing the three rows or columns). In each iteration,
        // it checks if the elements in a row or column are the same. If so, it returns the symbol of the winning player (either "X" or "O").
        //The function first checks rows by comparing elements within the same row. If they are the same, the function
        // returns the symbol (e.g., "X" or "O") of the winning player from that row.
        //Then, it checks columns by comparing elements within the same column. If they are the same, it returns the
        // symbol of the winning player from that column.
        //Finally, it checks two diagonal conditions from top-left to bottom-right and from top-right to bottom-left.
        // If either of these conditions is met, it returns the symbol of the winning player from the diagonal.
        //If none of these conditions are met, the function returns null to indicate that there's no winner yet.
    }
    // The contents of the array represent the state of the game board. In this case, it seems to represent
    // a Tic-Tac-Toe board where "X" and "O" are used to indicate the moves of two players. The "X"s and "O"s indicate
    // which player has made a move in each position on the board. For example, "X" in the top-left corner and "O" in
    // the center indicate that the "X" player made the first move in the top-left corner, and the "O" player made the
    // second move in the center, and so on. This array can be used to represent the state of a Tic-Tac-Toe game and
    // can be further processed in the code to check for a win condition, a draw, or to display the current state
    // of the game to the players.

    //The program defines two functions:
    //printBoard(String[][] board):
    //This function takes a 2D array board as input and is responsible for displaying the current state of the
    // Tic-Tac-Toe game board to the console.
    //It uses a nested loop to iterate over the rows and columns of the board and prints each cell's contents.
    //checkForWinner(String[][] board):
    //This function also takes the game board as input and checks if there's a winner in the game.
    //It checks for winning conditions in rows, columns, and diagonals. If a winning condition is found, it returns
    // the symbol (either "X" or "O") of the winning player.
    //If there's no winner yet, it returns null.
}
