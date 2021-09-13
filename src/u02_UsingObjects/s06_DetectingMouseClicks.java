package u02_UsingObjects;

import java.awt.*;

public class s06_DetectingMouseClicks {
    public static void main(String[] args) {
        StdDraw.setScale(0, 100);
        StdDraw.enableDoubleBuffering();

        boolean didPressDown_SaveSlot = false;
        Color screenColor = StdDraw.YELLOW;

        double timeElapsed = 0.017;
        while (true) {
            boolean isClicked = false;
            if (didPressDown_SaveSlot && !StdDraw.isMousePressed()) { //equivalent to: didPressDown_SaveSlot==true && StdDraw.isMousePressed()==false
                isClicked = true;
            }


            if (isClicked == true) {
                if (screenColor.equals(StdDraw.YELLOW)) {
                    screenColor = StdDraw.GREEN;
                } else {
                    screenColor = StdDraw.YELLOW;
                }
            }

            StdDraw.setPenColor(screenColor);
            StdDraw.filledRectangle(50, 50, 90, 90);

            /* Store in didPressDown_SaveSlot whatever the value of StdDraw.isMousePressed() is.
             *  In other words, store in didPressDown_SaveSlot whether the mouse
             *  is currently being pressed down (true or false).
             *  When the while-loop ends, the variable didPressDown_SaveSlot will NOT
             *  be destroyed because didPressDown_SaveSlot is created outside the while-loop.
             *  The value stored in the variable will also stay the same. This means that when the
             *  while-loop runs the next time for the next frame, we can use didPressDown_SaveSlot
             *  in order to determine what happened in the previous frame of our animation. */
            didPressDown_SaveSlot = StdDraw.isMousePressed();


            StdDraw.show();
            StdDraw.pause((int) (timeElapsed * 1000));
            StdDraw.clear();
        }
    }

}
