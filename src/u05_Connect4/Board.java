package u05_Connect4;

public class Board {

    Token[][] board;

    public Board(){
        board = new Token[6][7];
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                System.out.print(board[row][col]);
            }
            System.out.println("---");
        }
    }

    /*
    7 columns
        -Each col should be 10 as the width
        -The columns will take up space from 0 to 70 (x-coordinates)
    6 rows
        -Each row shoud be 10 as the width



     */

    public void draw(){

    }


}
