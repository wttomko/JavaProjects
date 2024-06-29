package Solo;
public class TicTacToe {
    String[][] board = new String[3][3];
    
    int[][] winningCombos = {
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {1,4,7},
        {2,5,8},
        {3,6,9},
        {1,5,9},
        {3,5,7},
    };

    public TicTacToe(){

        for (int x=0; x<board.length; x++){
            for (int y=0; y<board[x].length; y++){
                board[x][y] = " ";
            }
        }

    }
    public void displayBoard(){
        for (int x=0; x<board.length; x++){
            for (int y=0; y<board[x].length; y++){
                System.out.print("[" + board[x][y] + "]" + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args){
        TicTacToe TTT = new TicTacToe();
        TTT.displayBoard();
    }
}
