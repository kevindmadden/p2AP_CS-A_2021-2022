package u05_Connect4;

public class Board {

    Token[][] board;

    public Board(){
        board = new Token[Main.NUM_OF_ROWS][Main.NUM_OF_COLS];
        //board = new Token[10][40]; //change board dimensions for fun
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
        -Each row should be 10 as the width
     */

    public void draw(){
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(35, 30,35,30);
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                int x = col*10;
                int y = row*10;
                StdDraw.setPenColor(StdDraw.WHITE);
                StdDraw.filledCircle(x+5, y+5, 4.5);
            }
        }
    }

    //This draw method draws the board accurately regardless of the board's dimensions
    public void fancyDraw(){
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(35, 30,35,30);
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                double x = col*(70.0/board[0].length)+0.5*(70.0/board[0].length); //int x = col*10;
                double y = row*(60.0/board.length)+0.5*(60.0/board.length); //int y = row*10;
                StdDraw.setPenColor(StdDraw.WHITE);
                //StdDraw.filledCircle(x,y, 0.5*(70.0/board[0].length)*.8); //StdDraw.filledCircle(x+5, y+5, 4.5);
                StdDraw.filledEllipse(x,y, 0.5*(70.0/board[0].length)*.8, 0.5*(60.0/board.length)*.8 );
            }
        }
    }


}
