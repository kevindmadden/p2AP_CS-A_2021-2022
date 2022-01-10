package u05_Connect4;

public class Board {

    Token[][] board;

    //[row][col]

    public Board(){
        board = new Token[6][7];
        // { row1:{...col...}, row2: {...col...},..., row6: {...col...}}
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                System.out.print(board[row][col]);
            }
            System.out.println("---");
        }
    }

    public void draw(){

    }


}
