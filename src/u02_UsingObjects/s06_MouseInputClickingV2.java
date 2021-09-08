package u02_UsingObjects;

import java.awt.*;

public class s06_MouseInputClickingV2 {

    public static void main(String[] args){
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering(); //Calling this method stops things from being drawn immediately after a draw method is called. This allows you to call many different draw methods without anything being drawn on the screen; when you call StdDraw.show(), everything will be drawn at once.

        boolean didPressDown = false;
        boolean isClicked = false;

        Color hoverColor = StdDraw.YELLOW;

        double timeElapsed = 0.017; //0.017 seconds-- this is how long each frame of our animation appears.
        while(true){
            double cursorX = StdDraw.mouseX();
            double cursorY = StdDraw.mouseY();

            didPressDown = StdDraw.isMousePressed(); //save off for next frame

            if(didPressDown && !StdDraw.isMousePressed()){ //if pressed down in previous frame but not pressed down in current frame...
                isClicked = true;
            }


            if(isClicked){
                if(hoverColor.equals(StdDraw.YELLOW)){
                    hoverColor = StdDraw.ORANGE;
                }else{
                    hoverColor = StdDraw.YELLOW;
                }
            }



            System.out.println(cursorX + ", " + cursorY); //useful for testing, comment out when not needed

            if(cursorX > 40 && cursorX < 60 && cursorY < 55 && cursorY > 45){
                StdDraw.setPenColor(hoverColor);
            }else{
                StdDraw.setPenColor(StdDraw.BLUE);
            }

            StdDraw.filledRectangle(50, 50, 10, 5);



            StdDraw.show(); //Because we have called StdDraw.enableDoubleBuffering(), everything that you draw up until this point will be loaded into java's memory but not actually drawn. Calling StdDraw.draw() then draws everything at once that is loaded into java's memory.
            StdDraw.pause((int)(timeElapsed*1000)); //You must pass to the pause method the number of milliseconds to pause for; so we multiply by 1000 because our timeElapsed variable is in seconds, not milliseconds.
            StdDraw.clear(); //This clears everything drawn on the screen. You must redraw the image you wish to display for each frame of an animation
        }
    }
}
