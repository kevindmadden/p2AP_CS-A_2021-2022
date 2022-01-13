package u05_Connect4;

public class Main {
    static final int NUM_OF_ROWS = 6;
    static final int NUM_OF_COLS = 7;


    public static void main(String[] arg){
        Board board = new Board();



        StdDraw.setScale(0, 70);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        boolean prevMouseClickedValue = false;
        boolean didClickOccur = false;

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while(true){
            //Mouse-clicking logic - Keep at top
            if(!StdDraw.isMousePressed() && prevMouseClickedValue){
                didClickOccur = true;
                System.out.println(StdDraw.mouseX()+ ", "+StdDraw.mouseY());
            }
            prevMouseClickedValue = StdDraw.isMousePressed();

            if(didClickOccur){
                int colNumToDropIn;
                for(int colNum = 0; colNum < Main.NUM_OF_COLS; colNum++ ){
                    if( StdDraw.mouseX() < (colNum+1)*10){
                        colNumToDropIn = colNum;
                        break;
                    }
                }


                if(StdDraw.mouseX() < 10){
                    colNumToDropIn = 0;
                }else if(StdDraw.mouseX() < 20){
                    colNumToDropIn = 1;
                }else if(StdDraw.mouseX() < 30){
                    colNumToDropIn = 2;
                }

            }







            board.draw();


            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int)(timeElapsed*1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }


    }
}
