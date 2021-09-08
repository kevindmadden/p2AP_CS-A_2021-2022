package u02_UsingObjects;

public class s05_if_MouseInput {
    public static void main(String[] args){
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.


        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while(true){

            double cursorX = StdDraw.mouseX();
            double cursorY = StdDraw.mouseY();

            System.out.println(cursorX + ", " + cursorY);

            //Comparison Operators:
                // < <= > >= == !=
            //Logic Operators
                // && - AND
                // || - OR
            if(cursorX > 46 && cursorX < 54 && cursorY < 60 && cursorY > 40){
                StdDraw.setPenColor(StdDraw.YELLOW);
            }else{
                StdDraw.setPenColor(StdDraw.BLUE);
            }

            StdDraw.filledRectangle(50, 50, 4, 10);


            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int)(timeElapsed*1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }
}
